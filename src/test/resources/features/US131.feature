Feature: API US_131	As a user, I should be able get blocked times..

  Scenario: TC_001
    Given user connects to the "/hypnotherapist/timeoff-period/all" api
      | title  |
      | online |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | status |
      | data   |
    Then user verifies the values of the fields
      | status |
      | true   |
		