package glue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class StepDefinitions extends BasePage {
	
	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		BasePage bp=new BasePage();
		bp.initializeBrowser();
	}

	@Given("^user opens the application$")
	public void user_opens_the_application() throws Throwable {
		BasePage bp=new BasePage();
		bp.openApplication();
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.enterPassword();
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLoginButton();
	}

	@Then("^login should be success$")
	public void login_should_be_success() throws Throwable {
		System.out.println("Login is success");
	}
	
	@Then("^user enters username (.*)$")
	public void user_enters_username_Admin(String uName) throws Throwable {
		System.out.println(uName);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName();
	}

	@Then("^user enters password (.*)$")
	public void user_enters_password_admin(String pwd) throws Throwable {
		System.out.println(pwd);
		LoginPage lp=new LoginPage(driver);
		lp.enterPassword();
	}


}
