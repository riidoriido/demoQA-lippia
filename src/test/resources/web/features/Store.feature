Feature: Bookstore
  @Smoke
  @Store

  Background: The user is in the bookstore section of the page
    Given the user navigates to the website

  Scenario: Check if there are products being shown
    When the user clicks on Bookstore App link
    Then the user is redirected to the Store section
    And the user should see the products list containing items

  Scenario Outline: Check if the search function is functional
    When the user clicks on Bookstore App link
    And the user inputs the keyword <query>
    And the user clicks the search button
    Then the products list should update its contents to match the search criteria

    Examples:
      | query  |
      | Git pocket guide |

  Scenario: Check if clicking on a product the user is redirected to such product details page
    When the user clicks on Bookstore App link
    And the user clicks on a Product
    Then the user is redirected to a page showing the details of such product

  Scenario: Check if clicking on the button to return to the products list from a product details page works
    When the user is viewing the Details Page of a product
    And the user clicks on the Back to Book Store button
    Then the user is redirected to the products list page

  Scenario: Going to Login page from Book Store page
    When the user clicks on Bookstore App link
    And the user clicks on the Login button
    Then the user is redirected to the Login Page