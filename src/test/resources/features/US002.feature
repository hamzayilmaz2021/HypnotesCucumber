Feature: As a user I should be able to see the various titles when I enter the homepage

  Scenario: TC001 Services, Features, Pricing, Contact us, About us, ? icon, Login, Sign Up headings should be visible
    Given user goes to the "/"
    Then user verifies the titles are visible

  Scenario: TC002 Services, Features, Pricing, Contact us, About us, ? icon, Login, Sign Up headings should be clickable
    Given user goes to the "/"
    Then user verifies the titles are clickable