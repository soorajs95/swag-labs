@Checkout
Feature: Checkout

  @Smoke
  Scenario: User should be able to successfully checkout products
    Given user is in swag labs home page
    And user logs in with credentials
      | username | standard_user |
      | password | secret_sauce  |
    When user adds fleece-jacket to the shopping cart
    And user clicks on the shopping cart icon
    When user clicks on checkout button
    And user fills in checkout information
      | firstName | sooraj       |
      | lastName  | sathianandan |
      | zipcode   | 1335TT       |
    And clicks on continue button
    Then user can see to checkout overview page
    When user clicks on finish button
    Then user can see the order confirmation



