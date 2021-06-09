package pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ConfigUtils;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static ConfigUtils config;
	public static ExtentTest test;
	public static ExtentReports report;
	
	public void initializeBrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		config=new ConfigUtils();
		
	}
	
	public void openApplication() {
		driver.get(config.getURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
