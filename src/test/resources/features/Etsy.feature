@etsy
Feature: Etsy Search Functionality
  Agile story: USer should be able to type any keyword ans see relevant information

  Scenario: Etsy Title Verification
    Given User is on the Etsy homepage
    Then User should see the title is as expected
#Expected: Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given User is on the Etsy homepage
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given User is on the Etsy homepage
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title
