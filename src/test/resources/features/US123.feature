Feature: API US_123	As a user, I should be able to delete a coupon.

  Scenario: TC_001 - Positive Scenario
    Given user connects to the "/promoCode/deleteCoupon" api
     | couponId |
     | 51       |
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mandatory fields
      | success   |

  Scenario: TC_002 - Negative Scenario
    Given user connects to the "/promoCode/deleteCoupon" api
      | couponId |
      | 51       |
    Then user verifies the status code of the response is "500"


