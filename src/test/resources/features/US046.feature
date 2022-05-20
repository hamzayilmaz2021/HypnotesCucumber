Feature: After logging in as User (Therapist), I should be able to see the Settings and Calendar page

  Background:
    Given user goes to the "https://qa-test.hypnotes.net/login"
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
    When user types "Therapist+tayfa2022" to the password input on the login page
    When user clicks on the login button on the login page

  Scenario: TC_001_TC_002_TC_003_TC_004	After logging in as User (Therapist), Settings and Calendar should be visible and clickable
    When user clicks on the scheduling on the dashboard
    Then user verifies the "Settings" is visible
    Then user verifies the "Calendar" is visible
    Then user verifies the "Settings" link is clickable
    Then user verifies the "Calendar" link is clickable

  #US_046	TC_001	Therapist(Log in)	Hamza	After logging in as User (Therapist), Settings should be visible
  #US_046	TC_002	Therapist(Log in)	Hamza	After logging in as User (Therapist), Calendar should be visible
  #US_046	TC_003	Therapist(Log in)	Hamza	After logging in as User (Therapist), Settngs should be visible
  #US_046	TC_004	Therapist(Log in)	Hamza	After logging in as User (Therapist), Calendar should be clickable