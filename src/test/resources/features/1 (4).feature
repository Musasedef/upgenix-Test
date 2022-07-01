Feature: Default

	
	@BRT-292
	Scenario Outline: 1-Users can log in with valid credentials 
		When "<User>" enters valid "<Username>" and valid "<Password>"
		And user clicks on the "login" button on the login page
		Then user should see the title is "#Inbox - Odoo"
		
		Examples:
		|User        |Username                |Password    |
		|PosManager  |posmanager100@info.com  |posmanager  |
		|SalesManager|salesmanager100@info.com|salesmanager|