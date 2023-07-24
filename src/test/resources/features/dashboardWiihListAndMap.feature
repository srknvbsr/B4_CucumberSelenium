@c_listAndMap

Feature: Dashboard Menu Checks

  Background:
    Given The user is on the login page

  @cucumberList
  Scenario: Example-1 for Cucumber List
    #Given The user is on the login page
    When The user logs in using "maho@hotmail.com" and "Maho123456789"
    Then The user should be able to login
    And The user should be able to see follow menu
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
    And The user should be able to see follow menu
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

    # Class Task f2 HW
    # go to web page -> https://demoqa.com/
    # verify that user see following menu list elements, forms,...Text Box







