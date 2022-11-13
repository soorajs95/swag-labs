@Login
Feature: Login

  Scenario: User should be able to login with valid credentials
    Given user is in swag labs home page
    When user logs in as standard user
    Then user should see the inventory page

  Scenario: User should not be able to login with invalid credentials
    Given user is in swag labs home page
    When user logs in with credentials
      | username | sooraj   |
      | password | password |
    Then user should see login error