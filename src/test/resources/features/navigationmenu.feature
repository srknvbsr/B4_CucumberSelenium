@regression
  @navigation
Feature: Navigation Menu Tests
  #Task
  #
  #Create a new file navigationMenu.feature
  #First Scenario:
  #   Login as Mike
  #   Verify that 'Dashboard' text is visible, assert it
  #   Go to developers menu
  #   Verify that 'Developers' text is visible
  #
  #Second Scenario:
  #   Login as Sebastian
  #   Verify that 'Dashboard' text is visible, assert it
  #   Go to Forms/Input menu
  #   Verify that 'General Form Elements - Input' text is visible
  #
  #Third Scenario:
  #   Login as John
  #   Verify that 'Dashboard' text is visible, assert it
  #   Go to My Profile menu
  #   Verify that 'User Profile' text is visible
  #
  #
  #Note: Use all features that we learnt such as tags, dryrun, hooks, @before, @after, reusability of steps etc.

  @mike
  Scenario: The user goes to Developer Menu
    Given The user is on the login page
    When Login as Mike
    Then Validate that Dashboard text is visible
    When The go to developer Menu
    Then Validate that Deveolopers text is visible

  @Sebastian @smoke @dataBase
  Scenario: Go to forms-Input Menu
    Given The user is on the login page
    When Login as Sebastian
    Then  Validate that Dashboard text is visible
    When The go to Forms-Input Menu
    Then  Validate that General Form Element-Input text is visible

  @John @dataBase
  Scenario: Go to My profil Menu
    Given The user is on the login page
    When Login as John
    Then Validate that Dashboard text is visible
    When The go to My profil Menu
    Then  Validate that User profil text is visible


