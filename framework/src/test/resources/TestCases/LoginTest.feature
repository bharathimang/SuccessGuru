Feature: Login

  Background: 
    Given user launches the browser
    And user opens the application

@test1
  Scenario Outline: Login to the application with the valid credentials
    Then user enters username <userName>
    Then user enters password <password>
    When clicks on login button
    Then login should be success

    Examples: 
      | userName | password |
      | Admin    | admin123 |

  Scenario: Login to the application with the valid credentials
    Then user enters username
    Then user enters password
    When clicks on login button
    Then login should be success
