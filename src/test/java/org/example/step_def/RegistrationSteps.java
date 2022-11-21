package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class RegistrationSteps extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();

    @When("^I enter Firstname \"([^\"]*)\"$")
    public void i_enter_Firstname(String fisrtname) throws Throwable {
        registrationPage.enterFirstname(fisrtname);
    }

    @When("^I enter Lastname \"([^\"]*)\"$")
    public void i_enter_Lastname(String lastname) throws Throwable {
        registrationPage.enterLastname(lastname);
    }

    @When("^I enter valid email on register page \"([^\"]*)\"$")
    public void i_enter_valid_email_on_register_page(String emailOnRegister) throws Throwable {
        registrationPage.enterEmail(emailOnRegister);
    }

    @When("^I enter password on ragister page \"([^\"]*)\"$")
    public void i_enter_password_on_ragister_page(String passwordOnRegister) throws Throwable {
        registrationPage.enterPassword(passwordOnRegister);
    }

    @When("^I enter confirm password \"([^\"]*)\"$")
    public void i_enter_confirm_password(String confirmPassword) throws Throwable {
        registrationPage.enterConfirmPassword(confirmPassword);
    }

    @When("^I click on register button on registeration page$")
    public void i_click_on_register_button_on_registeration_page() throws Throwable {
        registrationPage.clickRegisterButtonOnRegister();
    }

    @Then("^I should see \"([^\"]*)\" on registration page$")
    public void i_should_see_on_registration_page(String expectedRegistrationMessage) throws Throwable {
        String actulRegistrationMessage = registrationPage.getRegisterMessageDisplayed();
        assertThat(actulRegistrationMessage, is(equalToIgnoringCase(expectedRegistrationMessage)));
    }

    /*@Then("^I should see logout button displayed$")
    public void i_should_see_logout_button_displayed(String logoutButtonDisplayed) throws Throwable {
        String actulButton = registrationPage.getLogoutButtonDisplayed();
        assertThat(actulButton, is(equalToIgnoringCase(logoutButtonDisplayed)));
    }

     */

    @And("^I should see text \"([^\"]*)\" in URL$")
    public void iShouldSeeTextInRegisterURL(String expectedURLText) throws Throwable {
        String actualURL1 = getURL();
        System.out.println(actualURL1);
        assertThat(actualURL1, containsString(expectedURLText));
    }
}