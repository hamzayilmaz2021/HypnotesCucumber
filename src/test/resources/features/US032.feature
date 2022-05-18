Feature: US_032	As a user I should be able to see different options in Sign Up

  Scenario Outline: US_032_TC_001 'Sign up as a client?', 'Client Register' should be visible
    Given user goes to the "https://qa-test.hypnotes.net/register"
    Then user verifies the "<text>" is visible
    Examples:
      | text                 |
      | Client Register      |

  Scenario: US_032_TC_002 Client Register should be clickable	Client Register
    Given user goes to the "https://qa-test.hypnotes.net/register"
    Then user verifies "Client Register" is clickable

  Scenario: US_032_TC_003 https://qa-test.hypnotes.net/register/client should be reachable, after clicking on the Client Register
    Given user goes to the "https://qa-test.hypnotes.net/register"
    When user clicks on the "Client Register" link
    Then user verifies the url is "https://qa-test.hypnotes.net/register/client"
