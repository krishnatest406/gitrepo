Feature: Login gmail application

  Scenario Outline: validate gmail
    Given open browser
    When launch "https://www.gmail.com" site
    And enter userId as <Uid> and click on next button
    And enter password as <pw> and click on next button
    Then check the composite btn is displayed or not
    When close the site

    Examples: 
      | Uid                   | pw        |
      | utester7797@gmail.com | tester406 |
  #    | testjenkins89@gmail.com | tester406    |
