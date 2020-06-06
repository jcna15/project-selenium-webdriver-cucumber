Feature: Desktop WEB UI Redmine Login
  As a user,
  I want to be able to login on Redmine

  @E2E
  Scenario: User inputs correct username and password
    Given I go to the Redmine login page on URL
    When I login with my credentials user "jnavarro" and "jnavarro"
    Then I should see the homepage with the username "jnavarro"