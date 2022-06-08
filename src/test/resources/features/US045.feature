Feature: After logging in as User (Therapist), Services should be visible

  Scenario: TC_001_TC_002	After logging in as User (Therapist), Services should be visible and clickable
    Given user goes to the "/dashboard/calendar" with "login"
    When user accepts the cookies
    Then user verifies the "Services" is visible
    Then user verifies the "Services" link is clickable

