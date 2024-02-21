package com.example.c360_integration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = about:blank
public class EditVehicle extends VehicleManager {

    @FindBy(id = "fld-vehicledescription") public WebElement vehicleNameTxtBox;
    @FindBy(xpath = "//table[@class='x-grid-table.x-grid-table-resizer']") public WebElement navTable;

    // selected tab = "x-grid-row  x-grid-tree-node-expanded x-grid-row-selected x-grid-row-focused"
    // tab row class  = "x-grid-row  x-grid-tree-node-expanded"

    public EditVehicle(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}