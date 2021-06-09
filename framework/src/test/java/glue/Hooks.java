package glue;

import Utilities.ExtentReportUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class Hooks extends BasePage {
	
	@Before
	public void setUp() {
		ExtentReportUtils reportObj=new ExtentReportUtils();
		System.out.println("Hooks: This is the setup method");
	}
	
	@After
	public void tearDown() {
		ExtentReportUtils.tearExtentReport();
		driver.close();
		System.out.println("Hooks: This is the tearDown method");
	}

}
