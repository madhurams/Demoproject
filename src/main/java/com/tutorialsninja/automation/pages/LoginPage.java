package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Base.driver,this);
	}
    @FindBy(id="username")
	public static WebElement usernamefield;
    @FindBy(id="password")
	public static WebElement passwordfield;
    @FindBy(id="log-in")
   	public static WebElement loginButton;
    @FindBy(css="div[class$='alert-warning']")
    public static WebElement warningmessage;
    @FindBy(css="input[type='checkbox']")
    public static WebElement rememberme; 
}
