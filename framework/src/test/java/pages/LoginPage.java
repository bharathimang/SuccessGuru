package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import genericWrappers.Wrapper;

public class LoginPage extends BasePage {
	public static WebDriver lDriver;

	public LoginPage(WebDriver driver) {
		lDriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement uName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement pwd;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement btn;

	public void enterUserName() throws Throwable {
		uName.sendKeys(config.getUserName());
		Wrapper.createScreenCapture();
		test.log(Status.INFO, config.getUserName());
		test.log(Status.PASS, "User name has been entered");
	}

	public void enterPassword() throws IOException {
		pwd.sendKeys(config.getPassword());
		Wrapper.createScreenCapture();
		test.log(Status.INFO, config.getPassword());
		test.log(Status.PASS, "Password has been entered");
	}

	public void clickOnLoginButton() throws IOException {
		btn.click();
		Wrapper.createScreenCapture();
		test.log(Status.PASS, "Login button has been clicked");
	}

}
