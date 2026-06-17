package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseDesignSteps {
	WebDriver driver;
	@Given("User should open Chrome Browser")
	public void user_should_open_chrome_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("User should Enter Url in Browser")
	public void user_should_enter_url_in_browser() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    
	}

	@When("User should navigate home page")
	public void user_should_navigate_home_page() {
		String homepage=driver.getTitle();
		System.out.println("homepage");
	   
	}

	@When("Enter username and password in edit box")
	public void enter_username_and_password_in_edit_box() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	    
	}

	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		String acturalText=driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']")).getText();
		String expectedText="Logged In Successfully";
		Assert.assertEquals(acturalText, expectedText);
		System.out.println("Log in Successfully");
	}
}
