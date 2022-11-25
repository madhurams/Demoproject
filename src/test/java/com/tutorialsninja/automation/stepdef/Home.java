package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.Homepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Home {
	Homepage homepage=new Homepage();

	@Then("I click on Amount header in the transaction table")
	public void i_click_on_Amount_header_in_the_transaction_table() {
	    
	Elements.click(Homepage.amountlink);
	
	}
	

	@And("Check the values are stored")
	public void check_the_values_are_stored() {
		Elements.VerifyTextEquals(Homepage.success, "+ 1,250.00 USD");
	}
}
