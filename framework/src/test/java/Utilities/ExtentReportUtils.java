package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.BasePage;

public class ExtentReportUtils extends BasePage {
	
	public ExtentReportUtils() {
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("target//extentReport//report.html");
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		test=report.createTest("Automation Testing");
	}
	
	public static void tearExtentReport() {
		report.flush();
	}

}
