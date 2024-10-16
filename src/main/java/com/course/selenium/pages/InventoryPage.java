package com.course.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    private final WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "inventory_list")
    private WebElement inventoryList;

    @FindBy (className = "product_sort_container")
    private WebElement sortButton;

    @FindBy (className = "active_option")
    private WebElement activeSortOption;

    public boolean inventoryListExist(){
        return inventoryList.isDisplayed();
    }

    public void clickSortButton(){
        sortButton.click();
    }

    public void selectOrder(String order) {
        Select select = new Select(sortButton);
        select.selectByValue(order);
    }

    public String orderName(){
        return activeSortOption.getText();
    }
}
