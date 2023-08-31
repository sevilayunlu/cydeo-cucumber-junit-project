

Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin Given user is on the login page of the library application

  Background: For all scenarıos user ıs on the logın page of the library application
  Given user is on the login page of the library application
@librarian @smoke
  Scenario: Login as librarian

    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
    #this is how we comment in feature file
@student @smoke
  Scenario: Login as student

    When user enters student username
    And user enters student password
    Then user should see the dashboard
@admin @smoke
  Scenario: Login as admin

    When user enters admin username
    And user enters admin password
    Then user should see the dashboard