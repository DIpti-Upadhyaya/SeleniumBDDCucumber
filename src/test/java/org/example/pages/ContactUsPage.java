package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends DriverManager {
    @FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
    WebElement contactUsText;

    public String getTextOnCotactUsPage() {
        return contactUsText.getText();
    }
}
