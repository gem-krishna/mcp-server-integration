# Architecture Diagram

```
+-------------------+
|   Feature Files   |
| (Gherkin syntax)  |
+-------------------+
          |
          v
+-------------------+
| Step Definitions  |
| (Java classes)    |
+-------------------+
          |
          v
+-------------------+
|   Test Runner     |
| (JUnit + Cucumber |
|  + Serenity)      |
+-------------------+
          |
          v
+-------------------+
| Playwright        |
| (Browser control) |
+-------------------+
          |
          v
+-------------------+
| Serenity Reports  |
| (HTML output)     |
+-------------------+
```

- Feature files define test scenarios.
- Step definitions implement scenario steps in Java using Playwright for browser automation.
- The test runner executes tests and integrates with Serenity for reporting.
- Serenity generates detailed test reports.

