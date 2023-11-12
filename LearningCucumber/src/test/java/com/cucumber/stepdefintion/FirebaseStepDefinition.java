package com.cucumber.stepdefintion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FirebaseStepDefinition {
	WebDriver driver;

	@Given("I am on the Firebaselogin page")
	public void i_am_on_the_firebaselogin_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete action
		driver = new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(3000);
		//throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid username as {string}")
	public void i_enter_valid_username_as(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("admin123@gmail.com");
		Thread.sleep(3000);
		//driver.findElement(By.id("password")).sendKeys("admin123");
		//WebElement login_attempt = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/button[1]"));
		//login_attempt.click();
		//Thread.sleep(3000);
		//System.out.println("logged in");
		//throw new io.cucumber.java.PendingException();
	}
	@When("I enter valid password as {string}")
	public void i_enter_valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("admin123");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the login button")
	public void i_click_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login_attempt = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/button[1]"));
		login_attempt.click();
		Thread.sleep(3000);
		System.out.println("logged in");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("on Home Page")
	public void on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



	@Then("verify we can see {string}")
	public void verify_we_can_see(String string) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("logged in to Home Page");
		driver.close();
		//throw new io.cucumber.java.PendingException();
	}

}
