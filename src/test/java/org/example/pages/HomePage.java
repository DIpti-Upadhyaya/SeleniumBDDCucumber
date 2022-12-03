package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    DriverManager driverManager= new DriverManager();
    //locator sould define in variable
    //action should be define in method
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement textOnHomePage;

    @FindBy(css = ".ico-login")
    WebElement loginButtonOnHomePage;
    @FindBy(css = ".ico-register")
    WebElement registerButton;

    @FindBy(xpath ="//a[@href= '/contactus']")
    WebElement contctUs;

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public String getTextFromHomePage() {
        return textOnHomePage.getText();
    }
    public void clickOnLoginButtonHomePage() {
    loginButtonOnHomePage.click();
    }

    public void clickOnContactUsButtonHomePage() {
        scrollTo(contctUs);
        //driverManager.scrollTo(contctUs);
        contctUs.click();}
}

