
  Feature: Test cases about Users API

    Background: User API is working as expected with all error scenarios


      Scenario: Users api with valid request and response using GET method
        Given Users API url can be called by system
        When  System call Users API url with valid data
        Then  Users API should return HTTP stats code 200
        And   Users API should return response with data in JSON format
