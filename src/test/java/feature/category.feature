Feature: category
  @category1
    Scenario Outline: category feature

    Given I am on Demo nopcommerce homepage
    When I click on "<button_name>" button
    Then I should able to verify I am nevigated to related page "<page_url>" successfully
    And I should able to verify the page title as "<page_title>"
    Examples:
    |button_name|page_url|page_title|
    |Computers  | https://demo.nopcommerce.com/computers |Computers|
    |Electronics | https://demo.nopcommerce.com/electronics |Electronics|
    |Apparel     | https://demo.nopcommerce.com/apparel     |Apparel    |
    |Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
    |Books             | https://demo.nopcommerce.com/books             | Books             |
    |Jewelry           |https://demo.nopcommerce.com/jewelry            |Jewelry            |
    |Gift Cards        | https://demo.nopcommerce.com/gift-cards        |Gift Cards         |
    @category2
    Scenario: I hover over the category link and verify the changes
      Given I am on Demo nopcommerce homepage
      When I hover over "Computers" category link
      Then I should able to verify after hover changes
      When I click on "Desktops" sub category
      Then I should nevigated to related sub category "page" sucessfully


