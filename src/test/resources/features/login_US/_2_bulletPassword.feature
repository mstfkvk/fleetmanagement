Feature: Users should see their password in bullet signs while typing (like ****)

  Scenario: AC-3
    When user types password
    Then user should see "***"