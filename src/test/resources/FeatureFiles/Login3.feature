Feature: Login functinality scenarios

	@Login @One
	Scenario: Verify whether the User is able to login with valid credentials
	     Given I launch the application
	     When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
	     And I click on login button
       Then I should see that the User is able to successfully login
      
   @Login @Two
   Scenario: Verify whether the user is not able to login without providing cedentials
       Given  I launch the application
	     When I login to the application using Username "" and Password ""
	     And I click on login button
       Then I should see error message that both username and password must
   @Login @Three
   Scenario: Verify whether the User is able to login with valid credentials
	     Given I launch the application
	     When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
	     And I click on remember me check box
	     And I click on login button
       Then I should see that the User is able to successfully login
       
     @Login @Four
     Scenario: Verify whether the User is able to login with valid credentials
	     Given I launch the application
	     When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
	      And I click on login button
       Then I should see that the User is able to successfully login
       
       