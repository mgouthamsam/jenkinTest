@Feature1
Feature: To validate login functionality of facebook application

  Background: 
    Given User have to enter facebook login through chrome browser

  @value1
  Scenario: 
    To validate Login by using Credential pages

    When User have to enter Valid email and Password
      | Username | Password | Email         | course |
      | Goutham  |  0987654 | 123@gmail.com | etab   |
      | sam      |    33698 | Sam@gmail.com | otab   |
    And User have to click login button
    Then User have to enter credentialas page

  @value2
  Scenario: 
      To validate login by using credential pages

    When User have to enter Invalid email and ivalid password
      | java | selenium | python | cucumbur |
      | sam  | goutham  | eema   | balaji   |
      | raji | sandy    | vijay  | daya     |
    And User have to click login button
    Then User have to enter credentialas page
