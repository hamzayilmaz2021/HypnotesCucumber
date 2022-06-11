Feature: API US_122	As a user, I should be able to update a coupon.

  Scenario: TC_001 - Positive Scenario
    Given user connects to the "/promoCode/update" api
      | promoCode | startedAt                     | enddedAt                      | usersLimit | discountType | discountRate | category | couponId |
      | 777777777 | Thu, 23 Jun 2022 11:28:59 GMT | Sat, 25 Jun 2022 11:28:59 GMT | 50         | percentage   | 60           | 3        | 51       |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success   |
      | promoCode |

  Scenario: TC_002 - Negative Scenario
    Given user connects to the "/promoCode/update" api
      | promoCode | startedAt                     | enddedAt                      | usersLimit | discountType | discountRate | category | couponId |
      | RASTGELE2 | Thu, 23 Jun 2022 11:28:59 GMT | Sat, 25 Jun 2022 11:28:59 GMT | 50         | percentage   | 60           | 3        | 51       |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success |
      | descr   |

