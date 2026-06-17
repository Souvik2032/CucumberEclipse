package testingcucumber;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2 {
	WebDriver driver;
	@Given("Open page")
	public void open_page() {
		 driver = new ChromeDriver();
		 driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		 driver.manage().window().maximize();
	}

	@When("Type username incorrectUser into Username field")
	public void type_username_incorrect_user_into_username_field() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		
	    
	}

	@When("password Password123 into Password field")
	public void password_password123_into_password_field() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("incorrectPassword");
	  
	}

	@When("Submit button")
	public void submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	   
	}

	@Then("Verify error message is displayed")
	public void verify_error_message_is_displayed() {
		WebElement er=driver.findElement(By.id("error"));
		if(er.isDisplayed()) {
			System.out.println("Error is displayed");
		}else {
			System.out.println("Error is not dispalyed");
		}
	}

	@Then("Verify error message text is Your username is invalid!")
	public void verify_error_message_text_is_your_username_is_invalid() {
		String actualText=driver.findElement(By.id("error")).getText();
		String expectedTest ="Your username is invalid!";
		Assert.assertEquals(actualText, expectedTest);
		System.out.println("Error is verified succesfull");
		}
	}
