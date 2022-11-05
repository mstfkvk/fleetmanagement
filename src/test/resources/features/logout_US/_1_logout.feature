@wip
Feature:logout functionality

  Background:
    When user is on the home page


  Scenario: AC-1, AC-2
    And user clicks to logout from profile menu
    Then verify user should land on login page

  Scenario:AC-3
    And user clicks to logout from profile menu
    And user clicks step back button
    Then user shouldn't go to home page

  Scenario: AC-4
    And user close the tab
    Then user must be logout

  Scenario: AC-5
    And user doesn't touch keyboard/mouse(AFK)
    Then user must be logout