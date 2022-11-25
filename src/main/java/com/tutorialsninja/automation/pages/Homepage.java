package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class Homepage {
	public Homepage() {
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(id="status")
	public static WebElement statuslink;
	
	@FindBy(id="amount")
	public static WebElement amountlink;
	
	@FindBy(xpath="(//span[@class='text-success'])[4]")
	public static WebElement success;

}
