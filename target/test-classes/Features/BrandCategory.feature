Feature: Login Feature

  Scenario: As a user I want to log into the Brands section Successfully
    Given I am on the homepage
    When I select brand category from header
    Then I should see the list of brands
    And I select DOLCE & GABBANA brand from list
    Then I should see the list of products from DOLCE & GABBANA

