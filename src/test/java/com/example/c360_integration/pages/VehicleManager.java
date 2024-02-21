package com.example.c360_integration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// page_url = https://demo.coretex.com/vehicle
public class VehicleManager extends CoretexBasePage {
    protected String page_sub_url = "/vehicle";
    public String vehicleNameClass = "x-grid-cell-description";

    /*
     * Page elements
     */
    @FindBy(id = "ext-vehicleEntityGrid-body")
    public WebElement vehiclesTableWrapper;
    @FindBy(id = "lblTotal")
    public WebElement totalVehicleLabel;


    public VehicleManager(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}