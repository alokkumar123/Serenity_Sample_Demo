Feature: Test

  @Test
  Scenario Outline: Test
    Given As a user, I launch URL <username> , <password>

  Examples:
          | username   | password |
          | alok kumar12 | alok@1234 |


  @Test123
  Scenario Outline: Testing gmail
      Given I launch URL with <url>
      When I enter word <serachingWord>

  Examples:
            | username   | password |  url | serachingWord |
            | alok kumar123 | alok@1234 | https://google.com | hello|

  @Test-Rest
  Scenario Outline: Testing rest
        Given Verifying County Code with <CountryCodeAPI>

   Examples:
             | username   | password |  url  | CountryCodeAPI |
             | alok kumar12 | alok@1234 | https://google.com | http://restapi.demoqa.com/utilities/weather/city/delhi |