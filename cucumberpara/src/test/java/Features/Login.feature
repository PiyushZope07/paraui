Feature: Login Scenario

@LoginValid
  Scenario Outline: Login With Valid Details
    Given Browser is launched
    When User clicks Registration Button
    And Firstly User enters Firstname as <FirstName>
    And Firstly User enters  Lastname as <LastName>
    And Firstly User enters  address as <Address>
    And Firstly User enters  city as <City>
    And Firstly User enters  state as <State>
    And Firstly User enters  zipcode as <ZipCode>
    And Firstly User enters  Phone Number as <PhoneNo>
    And Firstly User enters  SSN as <SSN>
    And Firstly User enters  Username as <Username>
    And Firstly User enters  Password as <Password>
    And Firstly User enters Repeat Password as <RPassword>
    And Firstly User Clicks on Register Button
    And User Clicks on LogOut
    And User enters Login Username as <LUsername>
    And User enters Login Password as <LPassword>
    And User Clicks on Login Button
    Then validate whether log out is present or not
    
    	Examples:
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword | LUsername | LPassword |
      | "101"     | "101"    | "101"   | "101" | "101" | "101"   | "101"   | "101" | "101"    | "101"    | "101"     | "101"     | "101"     |

@LoginInvalid
  Scenario Outline: Login With Invalid Details
    Given Browser is launched
    When User enters Login Username as <LUsername>
    And User enters Login Password as <LPassword>
    And User Clicks on Login Button
    Then Get Invalid Details Error Message
    
    	Examples:
      | LUsername | LPassword |
      | "101"     | "abc"     |

@LoginEmptyFields
  Scenario Outline: Login With Empty Fields
    Given Browser is launched
    When User enters Login Username as ""
    And User enters Login Password as ""
    And User Clicks on Login Button
    Then Get Empty Fields Error Message
    
    	Examples:
      | LUsername | LPassword |
      | ""        | ""        |
