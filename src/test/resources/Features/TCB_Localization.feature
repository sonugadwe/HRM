Feature: OrangeHRM configuration_localization Page


  Scenario: Validate configuration_localization page Test 
    
    Given User is on HomePage
    When User move to Admin , configuration And click on Localization
    Then User click on edit button
    Then Select langauge from dropdown
    Then Select date format
    Then click on save button 