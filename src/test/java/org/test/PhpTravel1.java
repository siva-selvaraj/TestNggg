package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravel1 extends BaseClass {
	
	public PhpTravel1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='btnCompleteOrder']")
	private WebElement cmporder;
	
	@FindBy(xpath="//a[text()=' Download']")
	private WebElement download;
	
	
	
	public WebElement getDownload() {
		return download;
	}



	public WebElement getCmporder() {
		return cmporder;
	}
	
	

}
