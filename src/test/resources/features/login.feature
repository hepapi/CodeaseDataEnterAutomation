Feature: Login Scenarios

  Background:
    Given navigate to home page

  Scenario: Successfully Login
    When open codease page
    And fill email credentials
    And fill password credentials
    Then verify home page successfully opened