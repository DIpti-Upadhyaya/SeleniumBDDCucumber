package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class HomeSteps extends DriverManager {
    HomePage homePage = new HomePage();
    DriverManager driverManager = new DriverManager();

    // @Given("^I am on the homepage$")
    //  public void i_am_on_the_homepage() throws Throwable {
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        String actualURL = getURL();
        System.out.println(actualURL);
        assertThat(actualURL, is(endsWith("nopcommerce.com/")));
        //  validation through title
        String actualTitle = driverManager.getTitle();
        System.out.println(actualTitle);
        assertThat(actualTitle, is(equalToIgnoringCase("nopCommerce demo store")));

        // validation through text from home page
        String actualTextOnHomePage = homePage.getTextFromHomePage(); //h2[contains(text(),'Welcome to our store')]
        System.out.println(actualTextOnHomePage);
        assertThat(actualTextOnHomePage, is(equalToIgnoringCase("Welcome to our store")));
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button() throws Throwable {
        homePage.clickOnLoginButtonHomePage();
    }


}
