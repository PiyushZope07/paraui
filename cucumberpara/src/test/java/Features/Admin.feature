Feature: ADmin

@AdminDatabaseInitialize
  Scenario: Database Initialization
    Given Admin Browser is Launched
    When Click on Admin Page
    And Click on Database Initialize
    Then Get text Database initialized

@AdminDatabaseClean
  Scenario: Database Clean
    Given Admin Browser is Launched
    When Click on Admin Page
    And Click on Database Clean
    Then Get text Database Clean

@AdminJMS
  Scenario: JMS Service
    Given Admin Browser is Launched
    When Click on Admin Page
    And Click on ShutDown Button
    Then Get ShutDown Status
    When Click on Startup Button
    Then Get Startup Status

@AdminAccessMode
  Scenario: Data Access Mode Checkbox is working or not.
    Given Admin Browser is Launched
    When Click on Admin Page
    And Click on SOAP Checkox
    Then Validate Soap Checkbox
    When Click on RestXML Checkox
    Then Validate RestXML Checkbox
    When Click on RestJSON Checkox
    Then Validate RestJSON Checkbox
    When Click on JDBC Checkox
    Then Validate JDBC Checkbox


@AdminSettings
  Scenario Outline: Admin settings are saved sucessfully
    Given Admin Browser is Launched
    When Click on Admin Page
    And Click on Database Initialize
    And Click on ShutDown Button
    And Click on Startup Button
    And Click on RestJSON Checkox
    And Enter Initial Balance as <initbalance>
    And Enter Minimum Balance as <minbalance>
    And Select JMS LoanProvider Dropdown
    And Select Available Funds LoanProcessor Dropdown
    And Enter Threshold Value as <threshold>
    And Click on Submit Button
    Then validate Setting Message

    Examples: 
      | initbalance | minbalance | threshold |
      | "50000"     | "10000"    | "5"       |
