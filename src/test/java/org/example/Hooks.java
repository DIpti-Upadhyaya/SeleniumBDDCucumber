package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {

    DriverManager driverManager = new DriverManager();

    @Before
    public void setup() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.goToURL();
        driverManager.maxBrowser();
        driverManager.applyImplicitwait();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}
