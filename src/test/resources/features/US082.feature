@sprint2 @smoke
Feature: US_082	As a user, I should be able to create Package in Add New Individual Sessions

    Background:
      Given user goes to the "/dashboard/calendar" with "login"
      When user accepts the cookies
      And user clicks on the "Services" link
      And user clicks on the packages link on the services page
      And user clicks on the "Generate Scheduler URL" button
      And user clicks on the "Add New Package" button
      And user waits for "3" seconds

  Scenario: TC_001
    When user types "3 Aylik Paket" to the name input on the add package page
    When user types "100" to the price input on the add package page
    When user clicks on the show price button on the add package page
    When user types "60" to the duration input on the add package page
    When user clicks on the block extra time button on the add package page
    When user types "15" to the block time before input on the add package page
    When user types "15" to the block time after input on the add package page
    When user clicks on the payment required button on the add package page
    When user clicks on the bookable button on the add package page
    When user clicks on the all documents checkbox on the add package page
    When user types "5" to the total sessions input on the add package page
    When user types "1" to the session interval input on the add package page
    When user types "Deneme aciklama." to the description input on the add package page
    When user clicks on the save button on the add package page
    Then user verifies the "3 Aylik Paket" package is visible on the available packages section

  Scenario: TC_002
    When user clicks on the cancel button on the add package page
    And user waits for "3" seconds
    Then user verifies the "Add Package" is not visible

  Scenario Outline: TC_003
    When user types data to the "<inputs>" on the add package page
    When user clicks on the save button on the add package page
    Then user verifies the "<warnings>" are visible on the add package page
    And user logs out of the system
    Examples:
      | inputs                                                                          | warnings                                                       |
      | price=100,duration=60,totalsessions=5,sessioninterval=1,description=Aciklama    | Please enter category name                                     |
      | name=3 Aylik,duration=60,totalsessions=5,sessioninterval=1,description=Aciklama | Please enter price                                             |
      | name=3 Aylik,price=100,totalsessions=5,sessioninterval=1,description=Aciklama   | Please select or enter a duration                              |
      | name=3 Aylik,price=100,duration=60,sessioninterval=1,description=Aciklama       | Please enter total session                                     |
      | name=3 Aylik,price=100,duration=60,totalsessions=5,description=Aciklama         | Please enter session interval                                  |
      | name=3 Aylik,price=100,duration=60,totalsessions=5,sessioninterval=1            | Please enter package description                               |
      | name=3 Aylik,price=100,duration=60,totalsessions=5                              | Please enter session interval,Please enter package description |


