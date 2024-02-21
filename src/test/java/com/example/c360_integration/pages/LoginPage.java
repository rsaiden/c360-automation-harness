package com.example.c360_integration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://demo.coretex.com/login?returnUrl=/tracking
public class LoginPage extends CoretexBasePage {

    @FindBy(id = "userid") public WebElement usernameTxtBox;
    @FindBy(id = "btnLogin") public WebElement passwordTxtBox;
    @FindBy(id = "btnLogin") public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}