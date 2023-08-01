@regression
Feature: Components Title Checks

  @title
  Scenario Outline: Title Checks (<tab> and <module>)
    Given The user is on the login page
    When The user enters developer credentials
    And The user navigates to "<tab>" and "<module>" sub menu
    Then Validate that "<title1>" and "<title2>" and "<title3>"
    Examples:
      | tab        | module       | title1 | title2     | title3    |
      | Components | Alerts       | Home   | Components | Alerts    |
      | Components | Accordion    | Home   | Components | Accordion |
      | Components | Carousel     | Home   | Components | Carousel  |
      | Components | List Group   | Home   | Components | Listgroup |
      | Components | Modal        | Home   | Components | Modal     |
      | Components | Tabs         | Home   | Components | Tabs      |
      | Components | Tooltips     | Home   | Components | Tooltips  |
      | Components | Charts       | Home   | Components | Charts    |
      | Components | Iframe       | Home   | Components | Iframe    |
      | Components | Open New Tab | Home   | Components | Opennew   |