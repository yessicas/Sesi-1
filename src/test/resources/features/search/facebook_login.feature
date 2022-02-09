Feature: Facebook login page
  As a user
  I want to perform login on facebook
  So that I can see my news feed

  @fbloginpage
  Scenario: Facebook login
    Given I open Facebook login page
    When I input email and password
    When I click button login
    Then I can see my news feed
