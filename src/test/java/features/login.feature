Feature: Login functionality

  @LoginTest @high-priority
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And clicks on the login button
    Then the user should be redirected to the homepage

  @InvalidLoginTest @high-priority
  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters invalid credentials
    And clicks on the login button
    Then an error message should be displayed
    And the user should remain on the login page

  @PasswordResetTest @low-priority
  Scenario: Resetting the password with an unregistered email
    Given the user is on the password reset page
    When the user enters an unregistered email address
    And clicks on the reset password button
    Then a message should be displayed stating that the email is not registered
    And the user should remain on the password reset page
