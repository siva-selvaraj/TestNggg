package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsReg extends BaseClass{
	
	public PhpTravelsReg() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Secondary_Sidebar-Actions-Domain_Registration")
	private WebElement crtdomain;
	
	@FindBy(xpath="//input[@id='inputDomain']")
	private WebElement search;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement srchbtn;
	
	@FindBy(xpath="(//span[@class='to-add'])[12]")
	private WebElement addcart;
	
	@FindBy(xpath="(//button[@type='button'])[30]")
	private WebElement checkout;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement cnte;

	@FindBy(xpath="//a[@id='checkout']")
	private WebElement cnte1;
	
	
	
	
	public WebElement getCnte1() {
		return cnte1;
	}

	public WebElement getCnte() {
		return cnte;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

	public WebElement getCrtdomain() {
		return crtdomain;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	

}
