package com.copilot.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Test runner for executing Cucumber feature files with Serenity integration.
 * Uses JUnit and CucumberOptions to configure test execution.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.copilot.automation.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class SerenityCucumberRunner {
    // This class is used as a test runner for Cucumber tests.
}
