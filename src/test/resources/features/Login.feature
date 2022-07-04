@BRT-293
Feature: Default

	Background: For the scenarios in the feature file, user is expected to be on the login page
		Given user is on the Upgenix login page

	@BRT-292
	Scenario Outline: 1-Users can log in with valid credentials
		When "<User>" enters valid "<Username>" and valid "<Password>"
		And user clicks on the "login" button on the login page
		Then user should see the title is "#Inbox - Odoo"

		Examples:
			|User        |Username                |Password    |
			|PosManager  |posmanager100@info.com  |posmanager  |
			|SalesManager|salesmanager100@info.com|salesmanager|

	
	@BRT-294
	Scenario Outline: "Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
		When "<User>" enters "<Username>" and "<Password>"
		And user clicks on the "login" button on the login page
		Then user should see "Wrong login/password" notice message
		
		Examples:
		|User        |Username                 |Password     |
		|PosManager  |posmanager@info@.com    |posmanager  etghrt |
		|SalesManager|salesmanager@info@.com  |salesmanagerreg |
		|PosManager  |posmanager10@info.com   |posmanager1ergf  |
		|SalesManager|salesmanager10@info@.com|salesmanager%rgfr|
		|PosManager  |posmanager10@info*.com  |posmanagerrtge  |
		|SalesManager|salesmanager10@infoa.com|salesmanager$fcer|


	@BRT-295
	Scenario Outline:  "Please fill out this field" message should be displayed if the password or username is empty
		When "<User>" enters valid "<Username>" and empty "<Password>"
		And user clicks on the "login" button on the login page
		Then user should see "Please fill out this field"

		Examples:
			| User         | Username                 | Password |
			| PosManager   | posmanager100@info.com   |          |
			| SalesManager | salesmanager100@info.com |          |

	@BRT-296
	Scenario: 4-User land on the ‘reset password’ page after clicking on the "Reset password" link
		When user should see "Please fill out this field"
		Then user should click the "reset password?" link
		And user sould be able to land reset p

	@BRT-297
	Scenario Outline: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
		Given : Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
		When : Users can log in with valid credentials

		Examples:
			|User        |Username                |Password    |
			|PosManager  |posmanager10@info.com  | posmanager  |
			|SalesManager|salesmanager@info.com  |salesmanager |
