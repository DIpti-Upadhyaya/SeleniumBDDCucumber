package org.example.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(css = ".page-title")
    WebElement welcomeTextOnLoginPage;

    @FindBy(xpath="//input[@data-val-required='Please enter your email']")
    WebElement emailInputField;

    @FindBy(id="Password")
    WebElement passwordInputField;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginButtonOnLoginPage;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutButton;

    public String getWelcomeTextFromLoginPage(){
        return welcomeTextOnLoginPage.getText();
    }

    public void enterEmail(String email){
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButtonOnLoginPage(){
        loginButtonOnLoginPage.click();
    }

    public boolean logoutButtonDisplayed(){return logoutButton.isDisplayed();}
}
