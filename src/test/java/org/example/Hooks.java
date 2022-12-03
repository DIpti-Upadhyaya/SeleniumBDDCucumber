package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {

    DriverManager driverManager = new DriverManager();

    @Before
    public void setup() throws IllegalAccessException {
       driverManager.runOnLocalBrowser();
        //driverManager.runInHeadlessMode();
        driverManager.goToURL();
        driverManager.maxBrowser();
        //selenium 4driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //selenium 3.1
        driverManager.applyImplicitwait();
    }

    @After
    public void tearDown(Scenario scenario) {
        //Screenshot if scenario failed
        if(scenario.isFailed()){
            driverManager.takeScreenshot(scenario);
        }
        driverManager.closeBrowser();
    }
}
