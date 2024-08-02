@activity1
Feature: Google search

@smoketest
Scenario: Searching for Cheese on google 
	Given User is on the DuckDuckGo website
	When User searches for cheese
	Then User should see search results 