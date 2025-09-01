package com.copilot.automation.stepdefinitions;

import com.copilot.automation.config.PlaywrightConfig;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;

public class LoginSteps {
    private Page page;

    @Given("I am on the login page")
    @Step("Navigate to login page")
    public void navigateToLoginPage() {
        page = PlaywrightConfig.getPage();
        page.navigate("YOUR_APPLICATION_URL");
    }

    @When("I enter username {string} and password {string}")
    @Step("Enter login credentials")
    public void enterCredentials(String username, String password) {
        page.fill("[data-test=username]", username);
        page.fill("[data-test=password]", password);
    }

    @When("I click the login button")
    @Step("Click login button")
    public void clickLoginButton() {
        page.click("[data-test=login-button]");
    }

    @Then("I should see the dashboard")
    @Step("Verify successful login")
    public void verifyDashboard() {
        page.waitForSelector("[data-test=dashboard]",
            new Page.WaitForSelectorOptions().setState("visible"));
    }

    @After
    public void tearDown() {
        PlaywrightConfig.closePlaywright();
    }
}
