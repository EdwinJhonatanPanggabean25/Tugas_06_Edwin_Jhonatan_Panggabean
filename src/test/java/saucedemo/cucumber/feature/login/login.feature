Feature: Login Page SauceDemo

  Scenario: Success Login
    Given Halaman login saucedemo
    When  Input Username
    And Input Password
    And clik login button
    Then User in on dashboard page