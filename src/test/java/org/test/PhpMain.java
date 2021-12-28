package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PhpMain extends BaseClass{
	
		
		@BeforeClass
		public static void beforeclass() {
			chromeBrowser();
			urlLaunch("https://phptravels.com/demo/");
			SoftAssert s = new SoftAssert();
			impWait(10);
			s.assertTrue(currentUrl().contains("phptravels"), "verify url");
			System.out.println("before class");
		}
		
		@BeforeMethod
		public void beforemethod()  {
            System.out.println("before start"+new Date());
			System.out.println("before method");

		}
		
		@Test
		public static void test1() throws InterruptedException, AWTException, IOException {
			
			PhpTravelsLogin l = new PhpTravelsLogin();
			click(l.getLogin());
			SoftAssert s = new SoftAssert();
			getHandles(1);
			sendKeys(l.getEmail(), "agilan04@gmail.com");
			s.assertEquals(getAttribute(l.getEmail()),"agilan04@gmail.com","verified email");
			sendKeys(l.getPassword(), "welcome@123");
			Thread.sleep(30000);
			click(l.getLgbtn());
			
			click(l.getDomain());
			Thread.sleep(3000);
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			PhpTravelsReg k = new PhpTravelsReg();
			click(k.getCrtdomain());
			sendKeys(k.getSearch(), "selenium");
			Thread.sleep(30000);
			click(k.getSrchbtn());
			down(k.getAddcart());
			Thread.sleep(3000);
			click(k.getAddcart());
			Thread.sleep(3000);
			click(k.getCheckout());
			click(k.getCnte());
			click(k.getCnte1());
            PhpTravel1 g = new PhpTravel1();
			
			down(g.getCmporder());
			Thread.sleep(30000);
	        click(g.getCmporder());
			screenshot("PhpTravelbooking");
			down(g.getDownload());
			click(g.getDownload());
			
			System.out.println("test 1");

		}
		
//		@SuppressWarnings("unused")
//		private static String JsgetAttribute(WebElement email) {
//			// TODO Auto-generated method stub
//			return null;
//		}

		@AfterMethod
		public void aftermethod()  {
			System.out.println("ending time"+new Date());
			System.out.println("aftermethod");
		}
		
		@AfterClass
		public static void afterclass() {
			System.out.println("afterclass");

		}
		
		
		
		
		
		
		
		
		
		
		
		
	

}
