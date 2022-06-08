#US_121	As a user, I should be able to get coupon list.	Coupon
#		User needs to be logged in to get response.
#		https://test.hypnotes.net/api/promoCode/getCoupons
#		Details on the swagger document.

Feature:  US_121	As a user, I should be able to get coupon list.	Coupon

  Scenario:
    Given user connects to the "/promoCode/getCoupons" api
    Then user verifies the status code of the response is "200"
    Then user verifies the api response has mendatory fields
      | id            |
      | code          |
      | startsAt      |
      | endsAt        |
      | numberOfUsers |
      | categories    |
      | discount      |
      | discountType  |
