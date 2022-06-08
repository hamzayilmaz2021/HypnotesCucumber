Feature: After logging in as User (Therapist), Coupons should be visible

  #Background:
  #  Given user goes to the "/login"
  #  When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
  #  When user types "Therapist+tayfa2022" to the password input on the login page
  #  When user clicks on the login button on the login page

  Scenario: TC_001_TC_002	After logging in as User (Therapist), Coupons should be visible and clickable
    Given user goes to the "/dashboard/calendar" with "login"
    When user accepts the cookies
    Then user verifies the "Coupons" is visible
    Then user verifies the "Coupons" link is clickable