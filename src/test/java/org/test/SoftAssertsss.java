package org.test;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class SoftAssertsss extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
		
		chromeBrowser();
		
		impWait(10);
		System.out.println("before class");
		

	}
	
	@BeforeMethod
	private void beforemethod() {
	
		
		System.out.println("starts with"+new Date());
		System.out.println("before method");
	}
	
	@Test(dataProvider="login",dataProviderClass=dataProvider.class)
	private void test1(String user,String pass) throws InterruptedException {
		urlLaunch("https://facebook.com");
		LoginPageFb fb = new LoginPageFb();
		sendKeys(fb.getUsrname(), user);
		sendKeys(fb.getPsward(), pass);
		click(fb.getLoginbtn());
		Thread.sleep(3000);
		back();
		refresh();
	}
	
	@Test(dataProvider="register",dataProviderClass=dataProvider.class)
	private void test2(String fname,String lname,String phno) {
		urlLaunch("https://facebook.com");
		RegistrationFb gg = new RegistrationFb();
		
		click(gg.getCreatebtn());
		sendKeys(gg.getFirstname(), fname);
		sendKeys(gg.getSurname(), lname);
		sendKeys(gg.getPhno(), phno);
	}
	
	@AfterMethod
	private void aftermethod() {
		
		System.out.println("end with"+new Date());
		System.out.println("after method");
	
	}
	  
	@AfterClass
	private void afterclass() {
		
		System.out.println("after class");
		
	}
	
//	@DataProvider(name="login")
//	public Object[][] data() {
//		Object [][] obj=new Object[][] {
//			{"siva","674574572"},
//			{"kathir","712638568"}
//		};
//		return obj;
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
