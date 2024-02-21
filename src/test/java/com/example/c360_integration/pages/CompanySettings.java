package com.example.c360_integration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = about:blank
public class CompanySettings  extends CoretexBasePage {

    public CompanySettings(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}