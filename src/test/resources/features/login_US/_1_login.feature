
Feature: As a user, I should be able to login.

  Scenario Template:<user>Login with valid credentials.
    When user is on the login page
    And user types "<username>" and "<password>" and clicks
    Then user should see "<pageSubTitle>"

    Examples:AC-1  with valid credentials

      | username        | password    | user          | pageSubTitle    |
      | user1           | UserUser123 | driver        | Quick Launchpad |
      | salesmanager101 | UserUser123 | Sales Manager | Dashboard       |
      | storemanager51  | UserUser123 | Store Manager | Dashboard       |

  Scenario Outline:AC-2-a  user Login with invalid credentials.
    When user is on the login page
    And user types "<username>" and "<password>" and clicks2
    Then user cannot be able to login

    Examples:with invalid credentials

      | username        | password   |
      | user123         | 523654     |
      | salesmanager101 | af324gf    |
      | salesmanager101 | neyseki    |
      |                 |            |
      |                 | 1234567890 |
      | storemanager51  |            |
      | faker           | fakir44    |


  Scenario Template:AC-2-b Warning Messages, While logging in
    When user is on the login page
    And user types "<username>" and "<password>" and clicks2
    Then user should see "<message>"1

    Examples:

      | username | password | message                     |
      |          |          | Please fill out this field. |
      | mk       |          | Please fill out this field. |
      |          | 44       | Please fill out this field. |