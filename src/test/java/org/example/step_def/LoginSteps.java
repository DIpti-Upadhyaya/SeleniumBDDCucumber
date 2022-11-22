package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\"is visible$")
    public void i_should_see_is_visible(String expectedWelcomeText) throws Throwable {
        String actulWelcomeText = loginPage.getWelcomeTextFromLoginPage();
        assertThat(actulWelcomeText, is(equalToIgnoringCase(expectedWelcomeText)));
    }

    @When("^I Enter Valid email \"([^\"]*)\"$")
    public void i_Enter_Valid_email(String email) throws Throwable {
        loginPage.enterEmail(email);
    }

    @When("^I Enter Valid Password \"([^\"]*)\"$")
    public void i_Enter_Valid_Password(String password) throws Throwable {
        loginPage.enterPassword(password);
    }

    @When("^I click on Login button on Login page$")
    public void i_click_on_Login_button_on_Login_page() throws Throwable {
        loginPage.clickOnLoginButtonOnLoginPage();
    }

    @Then("^I should see logout button displayed$")
    public void i_should_see_logout_button_displayed() throws Throwable {
        boolean logoutButtonIsDisplayed = loginPage.logoutButtonDisplayed();
        assertThat(logoutButtonIsDisplayed, is(true));
    }

    @And("^I should see text \"([^\"]*)\" in URL$")
    public void iShouldSeeTextInURL(String actualURL) throws Throwable {

        assertThat(actualURL, is(endsWith("/login")));
    }

    @When("^I enter invalid email \"([^\"]*)\"$")
    public void i_enter_invalid_email(String invalidEmail) throws Throwable {
        loginPage.enterInvalidEmail(invalidEmail);
    }

    @When("^I click on password input field$")
    public void i_click_on_password_input_field() throws Throwable {
        loginPage.clickOnPasswordField();
    }

    @Then("^I should see \"([^\"]*)\" text displayed$")
    public void i_should_see_text_displayed(String expectedErrorMessage) throws Throwable {
        String errorMessageDisplay = loginPage.wrongEmailDisplayed();
        assertThat(errorMessageDisplay, is(equalToIgnoringCase(expectedErrorMessage)));
    }

    @When("^I enter nullvalue in email \"([^\"]*)\"$")
    public void i_enter_nullvalue_in_email(String nullEmail) throws Throwable {
        loginPage.enterNullEmail(nullEmail);
    }

    @When("^I enter nullvalue in password \"([^\"]*)\"$")
    public void i_enter_nullvalue_in_password(String nullPassword) throws Throwable {
       loginPage.enterNullPassword(nullPassword);
    }
}