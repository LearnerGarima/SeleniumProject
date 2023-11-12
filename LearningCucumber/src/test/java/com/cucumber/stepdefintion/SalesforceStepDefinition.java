package com.cucumber.stepdefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SalesforceStepDefinition {
	WebDriver driver;

	@Given("I am on the Salesforce login page")
	public void OnSalesforceLoginPage() {
		//WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

	}

	@When("I enter valid username  and I enter valid password and I click the login button")
	public void i_enter_valid_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("garimas@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("@Bhadauria4");
		WebElement login_attempt = driver.findElement(By.xpath("//input[@id='Login']"));
		login_attempt.click();
		//Thread.sleep(5000);
		System.out.println("logged in");
		// throw new io.cucumber.java.PendingException();
	}

	/*@When("I enter invalid username")
	public void i_enter_invalid_username() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("Garima@tekarch");
		driver.findElement(By.id("password")).sendKeys("@Bhadauria4");
		WebElement login_attempt = driver.findElement(By.xpath("//input[@id='Login']"));
		login_attempt.click();
		Thread.sleep(2000);
		// throw new io.cucumber.java.PendingException();
	}

	@Then("I should see an error message indicating invalid username")
	public void i_should_see_an_error_message_indicating_invalid_username() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Invalid username");
		throw new io.cucumber.java.PendingException();
	}

	@When("I enter invalid password")
	public void i_enter_invalid_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("garimas@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Abc1234");
		WebElement login_attempt = driver.findElement(By.xpath("//input[@id='Login']"));
		login_attempt.click();
		Thread.sleep(5000);
		// throw new io.cucumber.java.PendingException();
	} */

	@Then("I should be logged in to the Salesforce account")
	public void i_should_see_an_error_message_indicating_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("log successfully");
		// throw new io.cucumber.java.PendingException();

	}
}
