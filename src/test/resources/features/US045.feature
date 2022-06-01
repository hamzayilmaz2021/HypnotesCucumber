Feature: After logging in as User (Therapist), Services should be visible

  Background:
    Given user goes to the "/login"
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
    When user types "Therapist+tayfa2022" to the password input on the login page
    When user clicks on the login button on the login page

  Scenario: TC_001_TC_002	After logging in as User (Therapist), Services should be visible and clickable
    Then user verifies the "Services" is visible
    Then user verifies the "Services" link is clickable

