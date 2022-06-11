Feature: API US_120	As a user, I should be able to create new coupon code.

  Scenario: TC_001 - Positive Scenario
    Given user connects to the "/promoCode/add" api
      | promoCode | startedAt                     | enddedAt                      | usersLimit | discountType | discountRate | category |
      | RASTGELE9 | Thu, 23 Jun 2022 11:28:59 GMT | Sat, 25 Jun 2022 11:28:59 GMT | 100        | percentage   | 75           | 3        |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success   |
      | promoCode |

  Scenario: TC_002 - Negative Scenario
    Given user connects to the "/promoCode/add" api
      | promoCode | startedAt                     | enddedAt                      | usersLimit | discountType | discountRate | category |
      | RASTGELE2 | Thu, 23 Jun 2022 11:28:59 GMT | Sat, 25 Jun 2022 11:28:59 GMT | 50         | percentage   | 60           | 3        |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success |
      | descr   |