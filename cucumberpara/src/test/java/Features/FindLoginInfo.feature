Feature: Find Login Information

@FindLoginValid
  Scenario Outline: Find Login Information Valid Details1
    Given Find- Browser is launched
    When Find- clicks Registration Button
    And Find- Firstly User enters Firstname as <FirstName>
    And Find- Firstly User enters  Lastname as <LastName>
    And Find- Firstly User enters  address as <Address>
    And Find- Firstly User enters  city as <City>
    And Find- Firstly User enters  state as <State>
    And Find- Firstly User enters  zipcode as <ZipCode>
    And Find- Firstly User enters  Phone Number as <PhoneNo>
    And Find- Firstly User enters  SSN as <SSN>
    And Find- Firstly User enters  Username as <Username>
    And Find- Firstly User enters  Password as <Password>
    And Find- Firstly User enters Repeat Password as <RPassword>
    And Find- Firstly User Clicks on Register Button
    And Find- User Clicks on LogOut
    And Find- User Clicks on Forgot Login Info
    And Find -User enters forgot Firstname as <FFirstName>
    And Find -User enters forgot Lastname as <FLastName>
    And Find- User enters forgot Address as <FAddress>
    And Find- User enters forgot city as <FCity>
    And Find- User enters forgot state as <FState>
    And Find- User enters forgot zipcode as <FZipCode>
    And Find- User enters forgot ssn as <FSSN>
    And User clicks on find my login info button
    Then Get Message of Valid Login Information

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | PhoneNo | SSN   | Username | Password | RPassword | FFirstName | FLastName | FAddress | FCity | FState | FZipCode | FSSN  |
      | "105"     | "105"    | "105"   | "105" | "105" | "105"   | "105"   | "105" | "105"    | "105"    | "105"     | "105"      | "105"     | "105"    | "105" | "105"  | "105"    | "105" |

@FindLoginInvalid
  Scenario Outline: Find Login Information Invalid Details
    Given Find- Browser is launched
    When Find- User Clicks on Forgot Login Info
    And Find- User Clicks on Forgot Login Info
    And Find -User enters forgot Firstname as <FFirstName>
    And Find -User enters forgot Lastname as <FLastName>
    And Find- User enters forgot Address as <FAddress>
    And Find- User enters forgot city as <FCity>
    And Find- User enters forgot state as <FState>
    And Find- User enters forgot zipcode as <FZipCode>
    And Find- User enters forgot ssn as <FSSN>
    And User clicks on find my login info button
    Then Get Message of Invalid Login Information

    Examples: 
      | FFirstName | FLastName | FAddress | FCity | FState | FZipCode | FSSN  |
      | "103"      | "103"     | "103"    | "103" | "103"  | "103"    | "103" |

@FindLoginEmpty
  Scenario Outline: Find Login Information Empty Fields
    Given Find- Browser is launched
    When Find- User Clicks on Forgot Login Info
    And Find- User Clicks on Forgot Login Info
    And Find -User enters forgot Firstname as <FFirstName>
    And Find -User enters forgot Lastname as <FLastName>
    And Find- User enters forgot Address as <FAddress>
    And Find- User enters forgot city as <FCity>
    And Find- User enters forgot state as <FState>
    And Find- User enters forgot zipcode as <FZipCode>
    And Find- User enters forgot ssn as <FSSN>
    And User clicks on find my login info button
    Then Get Message of Empty Login Information

    Examples: 
      | FFirstName | FLastName | FAddress | FCity | FState | FZipCode | FSSN |
      | ""         | ""        | ""       | ""    | ""     | ""       | ""   |
