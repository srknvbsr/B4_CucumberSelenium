@regression
Feature: Negative Login Test

  @NegativeLogin
  Scenario Outline: negative login test
    Given The user is on the login page
    When The user logs in using "<invalidUserEmail>" and "<invalidPassword>"
    Then Validate that warning message is "<message>"
    Examples:
      | invalidUserEmail | invalidPassword | message                                  |
      | mahohotmail.com  | Maho123456789   | Email address is incorrect. Please check |
      | maho@hotmail.com | Maho            | Password is incorrect. Please check      |
      |                  | Maho            | Please enter your email.                 |
      | maho@hotmail.com |                 | Please enter your password!              |
      |                  |                 | Please enter your email.                 |

