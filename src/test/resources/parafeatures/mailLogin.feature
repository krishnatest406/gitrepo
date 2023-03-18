Feature: para bank



  Scenario Outline: login with valid details and check all tabs
    Given open browser
    When launch "https://parabank.parasoft.com/parabank/index.htm" site
    Then login the application with username as <usn> and pw <pw> and click on enter btn
    And get account details
    And go to fund transfer menu and enter money and select sender and reciver details and click on transfer btn
    Then check the money is transfered or not
		When close the site
		
    Examples: 
      | usn         | pw      |
      | suryaking23 | surya22 |
