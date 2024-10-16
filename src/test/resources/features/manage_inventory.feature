Feature: Managing inventory

  @done
  Scenario Outline: Sorting items by given order
    Given the user is on login page and types "<email>" and "<password>"
    And the user clicks login button
    And the user clicks sort button
    Then the user sorts list by "<sort_order>"
    And the short button shows "<sort_name>"
    Examples:
      | email         | password     | sort_order | sort_name           |
      | standard_user | secret_sauce | za         | Name (Z to A)       |
      | standard_user | secret_sauce | hilo       | Price (high to low) |