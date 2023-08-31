Feature: Web Table App Login functionality
  Agile story:User should be able to login with correct credentials

  Scenario: Positive login scenario
    Given User is on the web table app login page
    When User enters valid username
    And  User enters  valid password
    And USer clicks to login button
    Then URL title should see orders word in the URL

  Scenario: Positive login scenario
    Given User is on the web table app login page
    When User enters "Test" username and "Tester" password
    And USer clicks to login button
    Then URL title should see orders word in the URL


  Scenario: Positive login scenario
    Given User is on the web table app login page
    When User enters below correct credentials
      | username | Test   |
      | password | Tester |


    And USer clicks to login button
    Then URL title should see orders word in the URL
