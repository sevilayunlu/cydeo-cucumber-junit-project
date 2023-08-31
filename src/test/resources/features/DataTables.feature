Feature:  Cucumber Data Tables Implementation Practices

  @dataTable
  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


    #Create a scenario where we list the type of pets we love
    #Print out all the strings in the list
  @pets
  Scenario: List of pets we love
    Then user sees below list
      | cat     |
      | dog     |
      | puppy   |
      | parrot  |
      | rabbit  |
      | hamster |

  @driverInfo
  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane          |
      | surname | Doe           |
      | age     | 29            |
      | address | somewhere     |
      | state   | CA            |
      | zipcode | 99999         |
      | phone   | 111-1111-1111 |