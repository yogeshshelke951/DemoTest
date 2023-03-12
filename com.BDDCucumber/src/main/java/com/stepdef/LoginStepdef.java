package com.stepdef;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepdef {
	WebDriver driver =null;
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_New.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
	   
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	   
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard",driver.getTitle());
		
	}
	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("mangesh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.xpath("//button")).click();
	}

	@Then("^verify email error$")
	public void verify_email_error() throws Throwable {
		WebElement error =driver.findElement(By.id("email_error"));
		Assert.assertTrue(error.isDisplayed());
		
	}
	
}
