Feature: If "Remember me on this computer" checkbox is clicked, User can see his/her credentials
  already entered in the login page in their next attempt.

  Scenario Outline: AC-5 remember_Me_checkbox with valid credentials
    When user is on the login page
    And user types "<username>" and "<password>" and clicks
    And user chooses remember_Me_checkbox with valid credentials
    And user is on the home page
    And user logouts
    Then user should see "username" and "password"

    Examples:
      | username        | password    |
      | user123         | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  Scenario Outline: AC-5 remember_Me_checkbox with invalid credentials
    When user is on the login page
    And user types "<username>" and "<password>" and clicks
    And user chooses remember_Me_checkbox
    And user is on the home page
    And user logouts
    Then user should see "username" and "password"

    Examples:

      | username           | password       |
      | user123123         | UserUser123123 |
      | salesmanager101123 | UserUser123123 |
      | storemanager51123  | UserUser123123 |
