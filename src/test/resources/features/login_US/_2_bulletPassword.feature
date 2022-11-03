Feature: Users should see their password in bullet signs while typing (like ****)

  Scenario: AC-3
    When user is on the login page
    And user types password
    Then sees bullet sign
