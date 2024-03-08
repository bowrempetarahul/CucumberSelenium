Feature: LoginTest

  @smoke
  Scenario: Login to Swag Labs test
    Given I Navigate to Swag Labs
    When I provide credentials
    Then Swag Labs home page should visible

  @smoke
  Scenario: LogoutTest
    Given I Navigate to Swag Labs
    When I provide credentials
#    Then I Do Logout


  @smoke
  Scenario Outline: Login to Swag Labs test
    Given I Navigate to Swag Labs
    When I enter Username as "<username>" and Password as "<password>"
    Then Swag Labs home page should visible
    Examples:
      | username | password |
      | problem_user | secret_sauce |
      | error_user | secret_sauce |


#  Scenario: Login to Swag Labs datatable
#    Given I Navigate to Swag Labs
#    When I enter Username and Password using datatable
#      | username | password |
#      | problem_user | secret_sauce |
#      | error_user | secret_sauce |
#    Then Swag Labs home page should visible

