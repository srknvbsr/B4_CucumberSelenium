Feature: Demoqa Menu Checks

  Background:




# Class Task f2 HW
    # go to web page -> https://demoqa.com/
    # verify that user see following menu list elements, forms,...Text Box
  @demoqaList
  Scenario: Example-4 for Task
    Given The user is on the home page
    Then The user should be able to see following demoqaMenu
      | Elements                |
      | Forms                   |
      | Alerts, Frame & Windows |
      | Widgets                 |
      | Interactions            |
      | Book Store Application  |