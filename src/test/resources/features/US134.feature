Feature: API US_134	As a user, I should be able change category colors.

  #DataTable örneği
  Scenario: TC_001
    Given user connects to the "/schedule/inCalender/setCategoryColor" api
      | İndividual | Packages | GroupSession | ShowedUp | Reschedule | Canceled | Noshow  |
      | #D127E0    | #D127E0  | #D127E0      | #D127E0  | #D127E0    | #D127E0  | #D127E0 |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success |


