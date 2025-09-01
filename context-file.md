# GitHub Copilot Agent Instructions for this Java Project

## Goals
1. **Generate JavaDocs**
2. **Summarize the Project**
3. **Migrating project framework**
4. **Identify duplicate code and refactor**

---

## 1. Generate JavaDocs
- Traverse the `src/` directory.
- For every `.java` file, ensure all classes, methods, and public fields are documented using standard JavaDoc conventions.
- If a class or method lacks JavaDocs, infer the purpose based on method names, parameters, return types, and context from nearby code.
- Use the format:

## 2. Summarize the Project
- Analyze the entire codebase to understand its purpose and functionality.
- Create a concise summary (3-5 sentences) of what the project does, its main features, and its intended use case.
- Place this summary in a `SUMMARY.md` file at the root of the project.
- Create a simple arcitecture diagram (using ASCII art or a simple text-based format) that outlines the main components and their interactions. Save this as `ARCHITECTURE.md`.

## 3. Migrate the code base to using Playwright for Java
-Identify all instances where Selenium WebDriver is used (imports, WebDriver initialization, WebElement usages, waits, interactions, etc.).
-Replace Selenium WebDriver code with equivalent Playwright for Java code using best practices:
-Replace WebDriver and WebElement with Playwright's Page, Locator, and other APIs.
-Use Playwright’s auto-waiting and selectors features instead of explicit waits.
-Replace Selenium actions like click, sendKeys, navigation, with Playwright equivalents.
-Ensure all functionalities remain intact after migration by checking existing test logic and flows.
-Test the updated code thoroughly to confirm Playwright interactions work as expected.
-Update all JavaDocs to reflect the use of Playwright instead of Selenium. For example, if a method used Selenium WebDriver, update the JavaDoc to describe Playwright usage instead.

## 4. Identify duplicate code and refactor steps or scenarios into reusable methods or classes
- Look for repeated code blocks, especially in test steps or scenario definitions.
- Extract these into reusable methods or utility classes to promote DRY (Don't Repeat Yourself) principles
- Ensure that the refactored code maintains the same functionality and is well-documented.
- Remove the duplicate code after refactoring to keep the codebase clean and maintainable.
- 
Document any major changes or architectural differences in code comments or a migration note file if applicable.
- 
```java
/**
 * Brief summary.
 *
 * @param paramName description
 * @return description
 */

/**
 * Navigates to the login page using Playwright Page API.
 *
 * @param page Playwright Page instance representing the browser page
 */
public void navigateToLoginPage(Page page) {
    page.navigate("https://example.com/login");
}
