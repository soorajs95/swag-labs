@ShoppingCart
Feature: Shopping Cart

  Scenario: User can add items to the shopping cart
    Given user is in swag labs home page
    And user logs in as standard user
    When user adds items to the shopping cart
      | backpack      |
      | bike-light    |
      | fleece-jacket |
    And user clicks on the shopping cart icon
    Then user can see the items in the shopping cart

  Scenario: User can remove items from the shopping cart
    Given user is in swag labs home page
    And user logs in as standard user
    When user adds items to the shopping cart
      | bolt-t-shirt |
      | onesie       |
    And user removes items from the shopping cart
      | bolt-t-shirt |
      | onesie       |
    When user clicks on the shopping cart icon
    Then user can see the shopping cart is empty