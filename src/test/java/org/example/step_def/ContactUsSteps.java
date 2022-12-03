package org.example.step_def;

import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.ContactUsPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class ContactUsSteps extends DriverManager {
ContactUsPage contactUsPage = new ContactUsPage();
    DriverManager driverManager = new DriverManager();
    @Then("^I should see \"([^\"]*)\"is visible on contact us page$")
    public void i_should_see_is_visible_on_contact_us_page(String expectecTectOnContactUs) throws Throwable {
       String actulContactUsText= contactUsPage.getTextOnCotactUsPage();
       assertThat(actulContactUsText, is(equalToIgnoringCase(expectecTectOnContactUs)));
    }
}
