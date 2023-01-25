Feature: Registration Scenario

@RegistrationWithValid
  Scenario Outline: Registration With Valid Details
    Given Browser is launched and User clicks Registration Button
    When User enters Firstname as <FirstName>
    And User enters  Lastname as <LastName>
    And User enters  address as <Address>
    And User enters  city as <City>
    And User enters  state as <State>
    And User enters  zipcode as <ZipCode>
    And User enters  Phone Number as <PhoneNo>
    And User enters  SSN as <SSN>
    And User enters  Username as <Username>
    And User enters  Password as <Password>
    And User enters Repeat Password as <RPassword>
    And User Clicks on Register Button
    Then Get Registration SucessFull Message

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword |
      | "104"     | "104"    | "104"   | "104" | "104" | "104"   | "104"   | "104" | "104"    | "104"    | "104"     |

@RegistrationWithoutSSN
  Scenario Outline: Registration Without SSN
  	Given Browser is launched and User clicks Registration Button
    When User enters Firstname as <FirstName>
    And User enters  Lastname as <LastName>
    And User enters  address as <Address>
    And User enters  city as <City>
    And User enters  state as <State>
    And User enters  zipcode as <ZipCode>
    And User enters  Phone Number as <PhoneNo>
    And User enters  SSN as <SSN>
    And User enters  Username as <Username>
    And User enters  Password as <Password>
    And User enters Repeat Password as <RPassword>
    And User Clicks on Register Button
    Then Get SSN Error Message

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword |
      | "abc"     | "abc"    | "abc"   | "abc" | "abc" | "abc"   | "abc"   | ""    | "abc"    | "abc"    | "abc"     |

@RegistrationWithEmptyFields
  Scenario Outline: Registration With Empty Fields
    Given Browser is launched and User clicks Registration Button
    When User enters Firstname as ""
    And User enters  Lastname as ""
    And User enters  address as ""
    And User enters  city as ""
    And User enters  state as ""
    And User enters  zipcode as ""
    And User enters  Phone Number as ""
    And User enters  SSN as ""
    And User enters  Username as ""
    And User enters  Password as ""
    And User enters Repeat Password as ""
    And User Clicks on Register Button
    Then Get Error Message

    Examples:
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword |
      | ""        | ""       | ""      | ""    | ""    | ""      | ""      | ""    | ""       | ""       | ""        | 