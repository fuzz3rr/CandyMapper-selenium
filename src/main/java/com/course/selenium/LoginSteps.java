package com.course.selenium;

import com.course.selenium.helpers.BrowserFactory;
import com.course.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = BrowserFactory.getDriver();
    HomePage homePage;

    @Given("the user is on login page and types {string} and {string}")
    public void theUserIsOnLoginPageAndTypesAnd(String login, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.inputLogin(login);
        homePage.inputPassword(password);
    }

    @And("the user clicks login button")
    public void theUserClicksLoginButton() {
        homePage = new HomePage(driver);
        homePage.clickLoginButton();
    }

    @Then("the page should display message {string}")
    public void thePageShouldDisplayMessage(String arg0) {
        homePage = new HomePage(driver);
        Assert.assertEquals(arg0, homePage.getErrorMessage());
    }


}
