package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.EndToEndDemoNopComPage;
import org.openqa.selenium.WebElement;

public class EndToEndDemoNopComSteps extends DriverManager {

    EndToEndDemoNopComPage endToEndDemoNopComPage = new EndToEndDemoNopComPage();

    @When("^I hoover on Computer tab and click on subelement notebooks$")
    public void i_hoover_on_Computer_tab_and_click_on_subelement_notebooks() throws Throwable {
        endToEndDemoNopComPage.selectedNotebookItem();
    }

    @When("^I click on  item HP Spectre XT Pro UltraBook on Notebooks page$")
    public void i_click_on_item_HP_Spectre_XT_Pro_UltraBook_on_Notebooks_page() throws Throwable {
        endToEndDemoNopComPage.chooseItemFromNotebooksPage();
    }

    @When("^I enter quantity \"([^\"]*)\"$")
    public void i_enter_quantity(String qty) throws Throwable {
        endToEndDemoNopComPage.enterQtyToAddInCart(qty);
    }

    @When("^I click on Add To Cart button$")
    public void i_click_on_Add_To_Cart_button() throws Throwable {
        endToEndDemoNopComPage.clickOnAddToCartButton();
    }

    @Then("^I click on Shopping cart button$")
    public void i_click_on_Shopping_cart_button() throws Throwable {
        endToEndDemoNopComPage.clickOnShoppingCartButton();
    }

    @Then("^I select/click terms and condition field$")
    public void i_select_click_terms_and_condition_field() throws Throwable {
        endToEndDemoNopComPage.clickOnTermOfService();
    }

    @Then("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {
        endToEndDemoNopComPage.clickOnCheckOutButton();
    }


}

