package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFb extends BaseClass {
	
	public RegistrationFb() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createbtn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement phno;
	
	@FindBy(id="password_step_input")
	private WebElement paswod;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getPaswod() {
		return paswod;
	}
	
	
	
	
	
	
	
	
	
	

}
