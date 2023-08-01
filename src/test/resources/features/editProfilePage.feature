@regression
Feature: Edit profile page

  @editprofile
  Scenario Outline: edit profile test
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    And The user navigates to "<name>" and "<menu>" sub menu
    And The user navigates to "<sub menu>"
    And The user adds "about" "<about>"
    And The user adds "company" "<company>"
    And The user select "<job>" from menu
    And The user adds "website" "<website>"
    And The user adds "location" "<location>"
    And The user adds "skills" "<skills>"
    And The user clicks on save changes button
    Examples:
      | userEmail        | password  | name         | menu       | sub menu     | about               | company   | job              | website           | location | skills                     |
      | mike@gmail.com   | mike1234  | mike         | My Profile | Edit Profile | graduated SDET 2023 | Krafttech | QA Test Engineer | www.kraftech.com  | Istanbul | Selenium,Java              |
      | john@gmail.com   | John1234. | John         | My Profile | Edit Profile | graduated SDET 2022 | Google    | QA               | www.google.com    | Istanbul | Selenium,Java              |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy | My Profile | Edit Profile | graduated SDET 2021 | Microsoft | SDET             | www.microsoft.com | Istanbul | Selenium,Java,Api,DataBase |