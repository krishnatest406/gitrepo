Feature: para bank

  #Scenario Outline: signup with fill all inputs
    #Given open browser
    #When launch "https://parabank.parasoft.com/parabank/register.htm;jsessionid=B6847911AC6D1DF0CA0CBA47FCA4EDFA" site
    #And enter firstName <fname> and lastName <lname>
    #And enter address as <adr> and city <ct> and state <st>
    #And enter zip as <zip> and phNum <phno> and ssn <ssnno>
    #And enter username as <usn> and pw <pw> and click on enter btn
    #Then check the welcome msg is displayed or not
    #When click on logout btn
    #Then login the application with username as <usn> and pw <pw> and click on enter btn
    #And get account details
    #And go to fund transfer menu and enter money and select sender and reciver details and click on transfer btn
    #Then check the money is transfered or not
    #When close the site
#
    #Examples: 
      #| fname | lname | adr     | ct      | st | zip    | phno      | ssnno | usn         | pw      |
      #| surya | king  | madurai | chennai | TN | 978321 | 092337821 |  4352 | suryaking26 | surya22 |

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
