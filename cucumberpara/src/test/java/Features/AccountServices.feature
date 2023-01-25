Feature: Login Scenario

@CheckingAccount
  Scenario Outline: Open Checking acount
    Given Account Browser is launched
    When Account User clicks Registration Button
    And Account User enters Firstname as <FirstName>
    And Account User enters  Lastname as <LastName>
    And Account User enters  address as <Address>
    And Account User enters  city as <City>
    And Account User enters  state as <State>
    And Account User enters  zipcode as <ZipCode>
    And Account User enters  Phone Number as <PhoneNo>
    And Account User enters  SSN as <SSN>
    And Account User enters  Username as <Username>
    And Account User enters  Password as <Password>
    And Account User enters Repeat Password as <RPassword>
    And Account User Clicks on Register Button
    And Account User Clicks on LogOut
    And Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Open Account
    And Select Checking Account from Dropdown
    And Click on Open Account Button

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword | LUsername | LPassword |
      | "101"     | "101"    | "101"   | "101" | "101" | "101"   | "101"   | "101" | "101"    | "101"    | "101"     | "101"     | "101"     |

@SavingsAccount
  Scenario Outline: Open Savings acount
    Given Account Browser is launched
    When Account User clicks Registration Button
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Open Account
    And Select Savings Account from Dropdown
    And Click on Open Account Button
    Then validate Savings Account Opening Message

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword | LUsername | LPassword |
      | "101"     | "101"    | "101"   | "101" | "101" | "101"   | "101"   | "101" | "101"    | "101"    | "101"     | "101"     | "101"     |

@TransferFunds
  Scenario Outline: Transfer Funds
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Transfer Funds
    And Enter transfer Amount as <transferamount>
    And Select Accounts for Transfer
    And User Clicks on Tranfser Button
    Then Validate Tranfser Success Message

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword | LUsername | LPassword | transferamount |
      | "101"     | "101"    | "101"   | "101" | "101" | "101"   | "101"   | "101" | "101"    | "101"    | "101"     | "101"     | "101"     | "5000"         |

@BillPay
  Scenario Outline: Bill Pay
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Bill Pay
    And Enter payee name as <payeename>
    And Enter Payee Address as <payeeaddress>
    And Enter Payee city as <payeecity>
    And Enter Payee state as <payeestate>
    And Enter Payee zipcode as <payeezipcode>
    And Enter Payee phoneno as <payeephoneno>
    And Enter Payee account as <payeeaccount>
    And Enter Payee verify account as <payeeaccount>
    And Enter Payee amount as <payeeamount>
    And Select FromAccount for Bill Pay
    And Click on Send Payment Button
    Then Validate  Bill Pay Sucess Message

    Examples: 
      | LUsername | LPassword | payeename | payeeaddress | payeecity | payeestate | payeezipcode | payeephoneno | payeeaccount | payeeaccount | payeeamount |
      | "101"     | "101"     | "101"     | "101"        | "101"     | "101"      | "101"        | "101"        | "101"        | "101"        | "101"       |

@FindTranscationByDate
  Scenario Outline: Find Transcation By Date
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Find Transcation
    And Enter Transcation Date as <transdate>
    And Click on Find my transcation button
    Then validate Suecess message for date transcation

    Examples: 
      | LUsername | LPassword | transdate    |
      | "101"     | "101"     | "01-18-2023" |

@FindTranscationByDateRange
  Scenario Outline: Find Transcation By Date Range
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Find Transcation
    And Enter Between Transcation Date as <betweentransdate>
    And Enter and Transcation Date as <andtransdate>
    And Click on Find my transcation date range button
    Then validate Suecess message for date range transcation

    Examples: 
      | LUsername | LPassword | transdate    | betweentransdate | andtransdate |
      | "101"     | "101"     | "01-18-2023" | "1-1-2023"       | "1-31-2023"  |

@FindTranscationByAmount
  Scenario Outline: Find Transcation By Amount
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Find Transcation
    And Enter Amount to find transction as <amounttransfind>
    And Click on find Transcation Amount Button
    Then validate Success message for Amount transcation

    Examples: 
      | LUsername | LPassword | transdate    | amounttransfind |
      | "101"     | "101"     | "01-18-2023" | "5000"          |

@UpdateContact
  Scenario Outline: Update Contact Information
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Update Contact Information
    And Update First Name as <updatefname>
    And Update Last Name as <updatelname>
    And Update Address as <updateaddress>
    And Update City as <updatecity>
    And Update State as <updatestate>
    And Update ZipCode as <updatezpc>
    And Update PhoneNumber as <updatepno>
    And Click on update button
    Then Validate Success Message for Update

    Examples: 
      | LUsername | LPassword | transdate    | updatefname | updatelname | updateaddress | updatecity | updatestate | updatezpc | updatepno |
      | "101"     | "101"     | "01-18-2023" | "abc "      | "abc "      | "abc "        | "abc "     | "abc "      | "abc "    | "abc "    |

@RequestLoan
  Scenario Outline: Request Loan
    Given Account Browser is launched
    When Account User enters Login Username as <LUsername>
    And Account User enters Login Password as <LPassword>
    And Account User Clicks on Login Button
    And Click on Request Loan
    And Enter Loan Amount as <loanamt>okay
    And Enter Downpayment as <downpayment>
    And Select Account
    And Click on Apply Now
    Then Validate Success Message for Loan 

    Examples:
     | LUsername | LPassword | loanamt| downpayment|
     |  "101"     | "101"    | "500"  | "101"      |