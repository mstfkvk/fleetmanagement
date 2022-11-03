
  Feature: User can see his own "username" (what he types in the username field) in the profile menu, after login

    Scenario Template:AC-7
      When user login successfully with "<username>"
      Then user should see "<username>" in the profile menu

      Examples:
      |username|
      |user123|
      |salesmanager101|
      |storemanager51|