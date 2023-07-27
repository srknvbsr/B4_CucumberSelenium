@regression
@c_listAndMap

Feature: Dashboard Menu Checks

  Background:
    Given The user is on the login page

  @cucumberList
  Scenario: Example-1 for Cucumber List
    #Given The user is on the login page
    When The user logs in using "maho@hotmail.com" and "Maho123456789"
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | maho       |


  @c_Map
  Scenario: Example 2 - for Cucumber Map
    #Given The user is on the login page
    When The user logs in using following menu
      | username | maho@hotmail.com |
      | password | Maho123456789    |
      | name     | maho             |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | maho       |

  @c_task_f1
      # go to web page
      # login with user credentials
      # navigates to my profil
      # see following menu Overview, Edit Profile, Add Experience, Add Education, Change Password
  Scenario: Example-3 for Task
    #Given The user is on the login page
    When The user logs in using "maho@hotmail.com" and "Maho123456789"
    And The user navigates to "maho" and "My Profile" subMenu
    Then The user should be able to see following submenu
      | Overview        |
      | Edit Profile    |
      | Add Experience  |
      | Add Education   |
      | Change Password |

  # day 5 Class Task f3
  # example 2 with scenario outline
  # use 3 different user credentials
  @c_dataTable_S_outline
  Scenario Outline: Example -2 for <name> Scenario Outline
    When The user logs in using following menu
      | username | <userEmail> |
      | password | <password>  |
      | name     | <name>      |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | <name>     |
    Examples:
      | userEmail        | password  | name         |
      | mike@gmail.com   | mike1234  | mike         |
      | john@gmail.com   | John1234. | John         |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy |









