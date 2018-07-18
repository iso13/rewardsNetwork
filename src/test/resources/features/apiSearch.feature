Feature: API Search
  As an Engr
  I need to validate GitHub APIs
  So I can perform searches

  Scenario Outline: Search by user, repository, issues, events, sort ascending
    Given I perform a GET request "<endpoints>"
    Then the response code should be 200

    Examples:
      | endpoints                                           |
      | users/iso13                                         |
      | orgs/octokit/repos                                  |
      | repos/vmg/redcarpet/issues?state=closed             |
      | users/iso13/events                                  |
      | search/repositories?q=cucumber&sort=stars&order=asc |

  Scenario: Validate request matches a json schema
    Given I perform a GET request "users/iso13"
    Then the response should match the following schema "user_search.json"

