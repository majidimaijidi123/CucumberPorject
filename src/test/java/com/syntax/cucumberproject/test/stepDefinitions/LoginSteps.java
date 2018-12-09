package com.syntax.cucumberproject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("^I navigate to the FreeCrm$")
	public void i_navigate_to_the_FreeCrm() {

		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^I enter valid Username and password$")
	public void i_enter_valid_Username_and_password() throws Exception {
		driver.findElement(By.name("username")).sendKeys("majidi");
		driver.findElement(By.name("password")).sendKeys("majidi123");
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement btnClick = driver.findElement(By.xpath("//input[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(btnClick));
		btnClick.click();

	}

	@Then("^I Successfully Login in$")
	public void i_Successfully_Login_in() throws Throwable {
		
		

	}

}
