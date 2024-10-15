Feature: Signing into the site

  @done
  Scenario Outline: Login as non-existing  user
    Given the user is on login page and types "<email>" and "<password>"
    And the user clicks login button
    Then the page should display message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | email                        | password |
      | ummdxgrujcboqmncgm@hthlm.com | 123321   |
