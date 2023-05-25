Feature: checkout As Guest
    Background:
    Given I am on Demo nopcommerce homepage
  @checkout_As_Guest
    Scenario: As a user, I should able to checkout as a guest successfully
      When I add Build your own computer product to cart
    And I add details of build your own computer
    And I click on add to cart button
    And I click on shopping cart button
    Then I verify shopping cart page url
    And I verify product name from shopping cart
    And I verify product details from shopping cart
    When I click on checkout
    Then I verify check out as a guest page
    When I click on check out as guest
    Then I verify billing page
    When I fill all the billing details
    Then I verify message that order has been proceed successfully
    And I verify checkout Complete page


