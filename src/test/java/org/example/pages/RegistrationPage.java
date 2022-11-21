package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {


    @FindBy(xpath = "//input[@data-val-required='First name is required.']")
    WebElement inputFirstname;

    @FindBy(id = "LastName")
    WebElement inputLastname;

    @FindBy(xpath = "//input[@data-val-required='Email is required.']")
    WebElement inputEmailOnRegisterPage;

    @FindBy(xpath = "//input[@data-val-required='Password is required.']")
    WebElement inputPasswordOnRegisterPage;

    @FindBy(id = "ConfirmPassword")
    WebElement inputConfirmPassword;

    @FindBy(id = "register-button")
    WebElement registerButtonOnRegister;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registerMessageDisplayed;

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logoutButtonDisplayed;

    public void enterFirstname(String firstname) {
        inputFirstname.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        inputLastname.sendKeys(lastname);
    }

    public void enterEmail(String emailOnRegisterPage) {
        inputEmailOnRegisterPage.sendKeys(emailOnRegisterPage);
    }

    public void enterPassword(String passwordOnRegisterPage) {
        inputEmailOnRegisterPage.sendKeys(passwordOnRegisterPage);
    }

    public void enterConfirmPassword(String confirmPassword) {
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickRegisterButtonOnRegister() {
        registerButtonOnRegister.click();
    }

    public String getRegisterMessageDisplayed(){
        return registerMessageDisplayed.getText();
    }

    public String getLogoutButtonDisplayed(){
        return logoutButtonDisplayed.getText();
    }

}


