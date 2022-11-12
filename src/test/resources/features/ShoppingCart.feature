@ShoppingCart
Feature: Shopping Cart

  Scenario: User can add items to the shopping cart
    Given user is in swag labs home page
    And user logs in with credentials
      | username | standard_user |
      | password | secret_sauce  |
    When user adds backpack to the shopping cart
    And user adds bike-light to the shopping cart
    And user clicks on the shopping cart icon
    Then user can see the items in the shopping cart

  Scenario: User can remove remove items from the shopping cart
    Given user is in swag labs home page
    And user logs in with credentials
      | username | standard_user |
      | password | secret_sauce  |
    When user adds bike-light to the shopping cart
    And user removes bike-light from the shopping cart
    When user clicks on the shopping cart icon
    Then user can see the shopping cart is empty