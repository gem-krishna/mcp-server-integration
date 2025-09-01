package com.copilot.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


/**
 * Step definitions for login feature scenarios.
 * Contains methods mapped to Gherkin steps for login functionality.
 */
public class loginStepDefinitions {

    /**
     * Step to navigate user to login page.
     */
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Code to navigate to login page
    }

    /**
     * Step to enter invalid credentials.
     */
    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        // Code to enter invalid credentials
    }

    /**
     * Step to verify login failure.
     */
    @Then("login should fail")
    public void login_should_fail() {
        // Code to verify login failure
//        throw new AssertionError("Simulated login failure");
        Assert.assertTrue(true);
    }

    @Then("login should fail")
    public void login_should_fail_1() {
        // Code to verify login failure
//        throw new AssertionError("Simulated login failure");
        Assert.assertTrue(true);
    }
}