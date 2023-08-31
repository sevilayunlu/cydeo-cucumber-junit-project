Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able to search anything and see the relevant results.

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google


  Scenario: Search result title verification
    Given user is on the Google search page
    When user searches for apple
    Then user should see the title apple-Google Search
    #As long as we do not use a white space, it will not break it. If we use a white space, it will not recognize as the same step