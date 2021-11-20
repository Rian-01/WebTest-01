Feature: Registration feature in demoqa.com
  As a user make a new account
  I want to Login with new account
  So that I can take books to list BooksStore


  Scenario: Registration Success
    Given I am on the Login in this page
    When I click 'New User' in page Registration
    When I enter First Name, Last Name, UserName, and Password
    When I click 'CHAPTCHA' robot
    And I click 'Register' in page Regis
    Then I was make a New Account