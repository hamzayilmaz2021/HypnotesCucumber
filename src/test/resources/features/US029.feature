#US_029	As a user, I should be able to check valid and invalid passwords.
#       When appropriate expressions are entered in the 'Password must contain the following' section, there should be a color change (red-green)
#		It should not be possible to register with invalid passwords.
#		Password must contain the following: 8-50 characters, A lowercase letter, A capital (uppercase) letter, A number, A special character

Feature: US_029	As a user, I should be able to check valid and invalid passwords

  Background:
    Given user goes to the "/register" with "null"
    When user accepts the cookies
    When user types "hamza yilmaz" to the fullname input
    When user types "hamza@gmail.com" to the email input

  Scenario Outline: US_029_TC_001 When appropriate expressions are entered in the 'Password must contain the following' section, there should be a color change (red-green)
    When user types "<password>" to the password input
    Then user verifies length of valid list is "<size>"
    Examples:
      | password | size |
      | A        | 1    |
      | Ab       | 2    |
      | Ab.      | 3    |
      | Ab.1     | 4    |
      | Ab.12345 | 5    |
      | AA       | 1    |
      | Abbb     | 2    |
      | Ab*-.    | 3    |
      | Ab.1asd  | 4    |
      | Ab.12345 | 5    |

  Scenario Outline: US_029_TC_002 It should not be possible to register with invalid passwords.
    When user types "<password>" to the password input
    Then user verifies the signup button is not clickable
    Examples:
      | password                                                        |
      |                                                                 |
      | A                                                               |
      | Ab                                                              |
      | Ab.                                                             |
      | Ab.1                                                            |
      | AA                                                              |
      | Abbb                                                            |
      | Ab*-.                                                           |
      | Ab.1asd                                                         |
      | QWERTYUIOPASDFGHJKLqwertyuiopasdfghjkl123456789987654321******* |

  Scenario Outline: US_029_TC_003 Password must contain the following: 8-50 characters, A lowercase letter, A capital (uppercase) letter, A number, A special character
    When user types "<password>" to the password input
    Then user verifies the signup button is clickable
    Examples:
      | password |
      | Ab.1asd8 |