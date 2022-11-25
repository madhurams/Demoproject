Feature: Verify after successful login check the values are stored
    @Home
    Scenario: Verify whether the User is able to login with valid credentials
	     Given I launch the application
	     When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
	     And I click on login button
       Then I should see that the User is able to successfully login
       Then I click on Amount header in the transaction table
       And Check the values are stored 
      
