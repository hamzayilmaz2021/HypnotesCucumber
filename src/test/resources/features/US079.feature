Feature: US_079	As a user, I should be able to add files to Documents

  Background:
    Given user goes to the "/login"
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
    When user types "Therapist+tayfa2022" to the password input on the login page
    When user clicks on the login button on the login page
    When user clicks on the "Documents" link
    When user clicks on the "Add Document" button

  Scenario: TC_001
    Then user verifies the titles are visible on the add document page
    When user logs out of the system

  Scenario:  TC_002
    Then user verifies the "Select File" button is clickable
    When user upload file to the input on the add document page
    Then user verifies the selected file input is enabled on the add document page
    Then user types "mental" to the selected file name input on the add document page
    When user clicks on the "Next" button
    Then user verifies the "Internshipmental" file name is displayed
    When user logs out of the system

  Scenario:  TC_003
    Then user verifies the "Select File" button is clickable
    When user upload file to the input on the add document page
    When user clicks on the "Next" button
    When user clicks on the annotation dropdown on the add package page
    Then user verifies the dropdown contains options on the add package page
      | Signature | Full Name | Initials | Date | Mail Address | Contact Person | Contact Person Phone | Custom Text | Checkbox |
    Then user verifies the optional field is enabled on the add document page
    And user switched to the iframe "webviewer-1"
    Then user verifies the pdf is visible on the add document page
    And user switched to the default content
    When user logs out of the system

  Scenario:  TC_004
    Then user verifies the "Select File" button is clickable
    When user upload file to the input on the add document page
    When user clicks on the "Next" button
    When user clicks on the "Next" button
    Then user verifies the "View Guide" button is clickable
    When user clicks on the "View Guide" button
    And user waits for "2" seconds
    Then user verifies the video is visible on the add document page
    When user logs out of the system

  Scenario:  TC_005
    Then user verifies the "Select File" button is clickable
    When user upload file to the input on the add document page
    When user clicks on the "Next" button
    When user clicks on the "Next" button
    When user clicks on the "Next" button
    And user switched to the iframe "webviewer-2"
    Then user verifies annotate button is enabled on the add document page
    Then user verifies insert button is enabled on the add document page
    When user clicks on the insert button on the add document page
    When user clicks on the add new signature button on the add document page
    Then user verifies the draw type and upload buttons are enabled on the add document page
    When user clicks on the type option on the add document page
    When user types "Deneme" to the type option input on the add document page
    When user clicks on the create button on the add document page
    And user switched to the default content
    When user logs out of the system

