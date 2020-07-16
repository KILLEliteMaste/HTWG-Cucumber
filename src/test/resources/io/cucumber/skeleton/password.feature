Feature: As a user, I want guidelines to create a strong password, so that I have limited risk for identity theft

  Scenario: Valid Password
    Given The user enters password dialog
    When The user enters "!Passwort" as password
    Then "Valid Password" is returned

  Scenario: No special char in password
    Given The user enters password dialog
    When The user enters "Passwort" as password
    Then "Invalid Password" is returned

  Scenario: Password is not long enough
    Given The user enters password dialog
    When The user enters "!Passwor" as password
    Then "Invalid Password" is returned

  Scenario: Password has not mixed upper/lower case characters
    Given The user enters password dialog
    When The user enters "!password" as password
    Then "Invalid Password" is returned