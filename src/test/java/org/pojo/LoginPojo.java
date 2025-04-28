package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);
	}

	// instead of findElement we are using Annotation

	@CacheLookup
	@FindBys({

			@FindBy(xpath = "//input[@id='email']"), 
			@FindBy(xpath = "//input[@name='email']"), 
			@FindBy(xpath = "//input[@type='text']") 
	})

	private WebElement txtUser;

	@CacheLookup
	@FindAll({
		@FindBy(xpath = "//input[@id='em678987ail']"), 
		@FindBy(xpath = "//input[@name='eail']"), 
		@FindBy(xpath = "//input[@type='password']") 
		
	})
	private WebElement txtPass;

	@CacheLookup
	@FindBy(name = "login")
	
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
