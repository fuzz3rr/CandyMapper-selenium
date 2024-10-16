package com.course.selenium;

import com.course.selenium.helpers.BrowserFactory;
import com.course.selenium.pages.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    private final WebDriver driver = BrowserFactory.getDriver();
    InventoryPage inventoryPage;
    @Then("the page should display inventory list")
    public void thePageShouldDisplayInventoryList() {
        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.inventoryListExist());
    }

    @And("the user clicks sort button")
    public void theUserClicksSortButton() {
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickSortButton();
    }

    @Then("the user sorts list by {string}")
    public void theUserSortsListBy(String order){
        inventoryPage = new InventoryPage(driver);
        inventoryPage.selectOrder(order);
    }

    @And("the short button shows {string}")
    public void theShortButtonShows(String orderName) {
        inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.orderName(), orderName);
    }
}