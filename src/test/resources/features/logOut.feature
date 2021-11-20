Feature: Log Out feature in demoqa.com
  As a user new account
  I want to Login and pick up some books
  So that I can take books to list BooksStore


  Scenario: Log Out Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button
    And I click 'Log Out' button in page Books Store
    Then I am back to Login page