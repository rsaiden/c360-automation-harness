package com.example.c360_integration.page_extensions;

import com.example.c360_integration.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://demo.coretex.com/login?returnUrl=/tracking
public class LoginExtension {
    protected LoginPage loginPage;
    protected String pageUrl = "https://demo.coretex.com/login";
    private String testUsername = "nataxuser1";
    private String testPassword = "Eroad@123";

    public LoginExtension(WebDriver driver) {
        PageFactory.initElements(driver, this);
        loginPage = new LoginPage(driver);
    }

    public void login() {
        loginPage.getDriver().get(pageUrl);

    }
}