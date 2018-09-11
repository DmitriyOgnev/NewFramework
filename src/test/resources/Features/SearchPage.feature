Feature: Search Functinality 

Scenario: Search Basic Term 
	Given User is on Home Page 
	When User searches for basic term 
	Then Title of the page changes to include basic term 
	
	
Scenario Outline: Search Multiple Basic Terms 
	Given User is on Home Page 
	When User searches for basic "<term>" 
	Then Title of the page changes to include basic "<term>" 
	
	Examples: 
		|term			|
		|test best		|
		|test mest		|
		|test crest		|
		|test zest		|
	