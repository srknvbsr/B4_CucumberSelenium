Feature: Login tests with cucumber parameters

  @mikeParameter @parameterizeMethod
  Scenario: Login with Mike - Cucumber parameters
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    Then Validate that username is "mike"

    #John
    @JohnParameter @parameterizeMethod
    Scenario: Login with John-Cucumber Parameter
      Given The user is on the login page
      When The user logs in using "john@gmail.com" and "John1234."
      Then The user should be able to login
      Then Validate that username is "John"

      #Eddie Murphy
      @EddiParameter @parameterizeMethod
      Scenario: Login with Eddie-Cucumber Parameter
        Given The user is on the login page
        When The user logs in using "eddiem@kraft.com" and "eddiem12"
        Then The user should be able to login
        Then Validate that username is "Eddie Murphy"
