package com.course.selenium;

import com.course.selenium.helpers.BrowserFactory;
import com.course.selenium.pages.AuthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = BrowserFactory.getDriver();
    AuthPage authPage;

    @Given("the user is on login page and types {string} and {string}")
    public void theUserIsOnLoginPageAndTypesAnd(String login, String password) {
        AuthPage authPage = new AuthPage(driver);
        authPage.inputLogin(login);
        authPage.inputPassword(password);
    }

    @And("the user clicks login button")
    public void theUserClicksLoginButton() {
        authPage = new AuthPage(driver);
        authPage.clickLoginButton();
    }

    @Then("the page should display message {string}")
    public void thePageShouldDisplayMessage(String arg0) {
        authPage = new AuthPage(driver);
        Assert.assertEquals(arg0, authPage.getErrorMessage());
    }

}
