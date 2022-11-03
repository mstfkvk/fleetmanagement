Feature: "Forgot your password?" link

  Scenario: AC-4
    When user clicks Forgot your password? link
    And user goes to forgot_password_page
    And user types username and clicks request button
    Then user should see message
      | Unable to send the email. |

