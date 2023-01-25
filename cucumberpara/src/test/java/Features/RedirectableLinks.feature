Feature: Redirectable Links

@AboutUS
  Scenario: About Us link is redirectable or not
    Given Redirect Browser is launched
    When click on About link
    Then About link should be redirected
    And Close the Driver

@Products
  Scenario: Products link is redirectable or not
    Given Redirect Browser is launched
    When click on Products link
    Then Product link should be redirected
    And Close the Driver

@Location
  Scenario: Location link is redirectable or not
    Given Redirect Browser is launched
    When click on Location link
    Then Location link should be redirected
    And Close the Driver

@BookStore
  Scenario: BookStore link is redirectable or not
    Given Redirect Browser is launched
    When click on BookStore link
    Then BookStore link should be redirected
    And Close the Driver

@LoanProcessor
  Scenario: LoanProcessorService link is redirectable or not
    Given Redirect Browser is launched
    When click on LoanProcessorService link
    Then LoanProcessorService link should be redirected
    And Close the Driver


@ParaBankService
  Scenario: ParaBankService link is redirectable or not
    Given Redirect Browser is launched
    When click on ParaBankService link
    Then ParaBankService link should be redirected
    And Close the Driver

@WADL
  Scenario: WADL link is redirectable or not
    Given Redirect Browser is launched
    When click on WADL link
    Then WADL link should be redirected
    And Close the Driver

@Swagger
  Scenario: SWAGGER link is redirectable or not
    Given Redirect Browser is launched
    When click on SWAGGER link
    Then SWAGGER link should be redirected
    And Close the Driver
