Feature: Data Driven Testing in Cucumber

  @c_ddf
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The user verify that account name equals "<sheetName>" <rowNumberForName>
    And The user verify that job name is equal "<rowNumberForJob>" in the "<sheetName>"
    Examples:
      | sheetName | rowNumber | rowNumberForName | rowNumberForJob |
      | QA 1      | 0         | 0                | 0               |


