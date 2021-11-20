Feature: Login feature in demoqa.com
  As a user go to BooksStore
  I want to take book
  So that I can see list my BooksStore


  Scenario: Login User dan pass Invalid
    Given I am on the Login page
    When I enter my username and Password incorrectly
    When I click 'Login' in page
    Then Warning system invalid pass or username


  Scenario: Login Blank Case
    Given I am on the Login page
    When I enter my username and Password Blank
    When I click 'Login' button in page
    Then I am stay in the page Login


  Scenario: Login Password Blank
    Given I am on the Login page
    When I enter my username correctly and Password Blank
    When I click 'Login' button in web
    Then I am stay in the page Login


  Scenario: Login Password Invalid
    Given I am on the Login page
    When I enter my username correctly and Password Invalid
    When I click 'Login' button in page system
    Then Nothing happens in page Login


  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button
    Then I am taken to the dashboard


  Scenario: Login User Blank
    Given I am on the Login page
    When I enter my username Blank
    When I click 'Login' button in web system
    Then Nothing happens in page web

  Scenario: Login User Invalid
    Given I am on the Login page
    When I enter my username incorrectly and Password correctly
    When I click 'Login' button web
    Then Noting Happens in Page

