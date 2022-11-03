Feature: User can use "Enter" key from their keyboard to switch to next field / btn
  AC-6
  Scenario Template:AC-6  using enter button with valid credential
    When user is on the login page
    And user types "<username>" and click ENTER
    And user types "<password>" and click ENTER
    Then user should see "<pageSubTitle>"

    Examples:AC-6  with valid credentials

      | username        | password    | user          | pageSubTitle    |
      | user123         | UserUser123 | driver        | Quick Launchpad |
      | salesmanager101 | UserUser123 | Sales Manager | Dashboard       |
      | storemanager51  | UserUser123 | Store Manager | Dashboard       |


  Scenario Template:AC-6 using enter button with invalid credential
    When user is on the login page
    And user types "<username>" and click ENTER
    And user types "<password>" and click ENTER
    Then user should see "pageSubTitle"

    Examples:AC-6  with valid credentials

      | username           | password       |
      | user123123asd      | UserUser123asd |
      | salesmanager101asd | UserUser123asd |
      | storemanager51asd  | UserUser123    |
      | storemanager51asd  |                |
      |                    | UserUser123    |

