package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EndToEndDemoNopComPage extends DriverManager {
    DriverManager driverManager= new DriverManager();

    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerTabOnMainMenu;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
            WebElement selectedNotebookSubElement;

    @FindBy(xpath = "//a[@href='/hp-spectre-xt-pro-ultrabook']")
    WebElement notbookSelected;

    @FindBy(id="product_enteredQuantity_7")
    WebElement enterQty;

    @FindBy(id = "add-to-cart-button-7")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartTab;

    @FindBy(id = "termsofservice")
    WebElement termOfService;

    @FindBy(id="checkout")
    WebElement checkOutButton;

    public void selectedNotebookItem() throws Exception {
        WebElement mainElement= computerTabOnMainMenu;
        WebElement subElement= selectedNotebookSubElement;
       driverManager.mouseHoverActions(mainElement,subElement);
    }

    public void chooseItemFromNotebooksPage(){
        notbookSelected.click();
    }

    public void enterQtyToAddInCart(String qty){
         enterQty.sendKeys(qty);
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnShoppingCartButton(){
        shoppingCartTab.click();
    }

    public void clickOnTermOfService(){
        termOfService.click();
    }

    public void clickOnCheckOutButton(){
        checkOutButton.click();
    }
      }
