Feature: Login

  Scenario: Invalid login fails
    Given user is on login page
    When user enters invalid credentials
    Then login should fail


  Scenario: Invalid login fails -1
    Given user is on login page
    When user enters invalid credentials
    Then login should fail


  Scenario: Invalid login fails -2
    Given user is on login page
    When user enters invalid credentials
    Then login should fail

  Scenario: Invalid login fails -3
    Given user is on login page
    When user enters invalid credentials
    Then login should fail
