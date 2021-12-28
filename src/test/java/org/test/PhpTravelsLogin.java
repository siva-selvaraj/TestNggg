package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsLogin extends BaseClass {
	
	
	public PhpTravelsLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id="inputEmail")
	private WebElement email;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
    private WebElement password;
	
	@FindBy(id="login")
	private WebElement lgbtn;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement domain;


	public WebElement getDomain() {
		return domain;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
