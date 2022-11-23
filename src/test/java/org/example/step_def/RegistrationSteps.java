package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.endsWith;
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

    @Then("^I should see \"([^\"]*)\" on registration page$")
    public void i_should_see_on_registration_page(String expectedRegistrationMessage) throws Throwable {
        String actulRegistrationMessage = registrationPage.getRegisterMessageDisplayed();
        assertThat(actulRegistrationMessage, is(equalToIgnoringCase(expectedRegistrationMessage)));
    }

    @And("^I click on register button on registration page$")
        public void i_click_on_register_button_on_registeration_page () throws Throwable {
            registrationPage.clickRegisterButtonOnRegister();
        }

    @And("^I enter confirmpassword \"([^\"]*)\"$")
    public void iEnterConfirmpassword(String confirmPassword) throws Throwable {
            registrationPage.enterConfirmPassword(confirmPassword);
        }

    @And("^I should find text \"([^\"]*)\" in URL$")
    public void iShouldFindTextInURL(String expectedURL1) throws Throwable {
        String actualURL= getURL();
        assertThat(actualURL, is(containsString(expectedURL1)));
    }

    @Then("^I should see my account \"([^\"]*)\" button displayed$")
    public void i_should_see_my_account_button_displayed(String expectedMyAccount) throws Throwable {
        String myAccountButton = registrationPage.myAccountButtonDisplayed();
        assertThat(myAccountButton, is(equalToIgnoringCase(expectedMyAccount)));
    }

   }