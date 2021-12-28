package org.test;

import org.testng.annotations.DataProvider;

public class dataProvider {

	@DataProvider(name = "login")

	public Object[][] test1() {
		Object[][] obj = new Object[][] {

				{ "uythg", "7894562" }, { "ffdrett", "478596" }

		};
		return obj;

	}

	@DataProvider(name = "register")
	public Object[][] test2() {
		Object[][] obj = new Object[][] { 
			
			{ "asdft", "478596" }, { "wrety", "475869" }

		};
		return obj;
	}

}
