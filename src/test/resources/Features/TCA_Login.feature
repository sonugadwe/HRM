Feature: OrangeHRM Login Page

Background:
		Given User Open Browser
  
  Scenario Outline: Validate login page Test 
  
    Given User is on Login Page
    When User Enter details "<username>" and "<password>"
	Then click on login button	
    Examples: 
      | username| password |
      | Admin   | admin123 |
