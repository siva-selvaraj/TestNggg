package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFb extends BaseClass {
	
	public LoginPageFb() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="email")
	private WebElement usrname;
	
	
	@FindBy(id="pass")
	private WebElement psward;
	
	@FindBy(name="login")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getUsrname() {
		return usrname;
	}


	public WebElement getPsward() {
		return psward;
	}
	
	

}
