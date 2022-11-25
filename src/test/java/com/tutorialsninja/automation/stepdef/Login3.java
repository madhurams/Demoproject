package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.Homepage;
import com.tutorialsninja.automation.pages.LoginPage;

import cucumber.api.java.en.*;

public class Login3 {
	LoginPage loginpage=new LoginPage();
	Homepage homepage=new Homepage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		Base.driver.get(Base.reader.getUrl());	    
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String username, String password)  {
		Elements.TypeText(LoginPage.usernamefield,username );
		Elements.TypeText(LoginPage.passwordfield,password );
		
	}
	@And("^I click on login button$")
	public void i_click_on_login_button() {
		Elements.click(LoginPage.loginButton) ;
	}

	@Then("^I should see that the User is able to successfully login$")
	public void i_should_see_that_the_User_is_able_to_successfully_login()  {
		Assert.assertTrue(Elements.isDisplayed(Homepage.statuslink));
			}
	@Then("I should see error message that both username and password must")
	public void i_should_see_error_message_that_both_username_and_password_must() {
	
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.warningmessage,"Both Username and Password must be present" ));
	}
	@And("I click on remember me check box")
	public void i_click_on_remember_me_check_box() {
	    Elements.click(LoginPage.rememberme);
	}
	


}

