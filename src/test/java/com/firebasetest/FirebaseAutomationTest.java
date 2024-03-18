package com.firebasetest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirebaseAutomationTest {
	@Test(priority = 0)
	public static void VaildLogin_FireBase_TestScript() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Chrome browser open");
		driver.get("https://qa-tekarch.firebaseapp.com");
		System.out.println("Url open in Chrome browser");

		
		// user name field
		WebElement emailField = driver.findElement(By.id("email_field"));

		if (emailField.isDisplayed()) {
			emailField.clear();
			emailField.sendKeys("admin123@gmail.com");
			System.out.println("Entered username in emailField");
		} else {
			System.out.println("username field is not displayed");
		}

		// password field
		WebElement passwordField = driver.findElement(By.id("password_field"));
		if (passwordField.isDisplayed()) {
			passwordField.clear();
			passwordField.sendKeys("admin123");
			System.out.println("Entered password in passwordField::::");
		} else {
			System.out.println("password field is not displayed");
		}

		// login to Account
		Thread.sleep(2000);
		WebElement loginElement = driver.findElement(By.xpath("//button[@onclick='login()']"));
		if (loginElement.isDisplayed()) {
			loginElement.click();
			System.out.println("Clicked login button");
		} else {
			System.out.println("login button is not displayed");
		}

		// Name field
		Thread.sleep(2000);
		WebElement nameElement = driver.findElement(By.xpath("//input[@id='name']"));
		if (nameElement.isDisplayed()) {
			nameElement.clear();
			nameElement.sendKeys("Ambuj Pandey");
			System.out.println("Entered name in nameElement");
		} else {
			System.out.println("Name field is not diplayed");
		}

		// Father Name field
		WebElement fatherNameElement = driver.findElement(By.xpath("//input[@id='lname']"));
		if (fatherNameElement.isDisplayed()) {
			fatherNameElement.clear();
			fatherNameElement.sendKeys("Peter Brown");
			System.out.println("Entered fathername in fatherNameElement field");
		} else {
			System.out.println("Father Name field is not diplayed");
		}

		// Postal Address
		WebElement postalAddress = driver.findElement(By.xpath("//input[@id='postaladdress']"));
		if (postalAddress.isDisplayed()) {
			postalAddress.clear();
			postalAddress.sendKeys("Hunterville, NorthCarolina");
			System.out.println("Entered postalAddress in postalAddress field");
		} else {
			System.out.println("Postal Address field is not diplayed");
		}

		// Personal Address
		WebElement personalAddress = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		if (personalAddress.isDisplayed()) {
			personalAddress.clear();
			personalAddress.sendKeys("2024 riveroak pl");
			System.out.println("Entered personalAddress in personalAddress field");
		} else {
			System.out.println("Personal Address field is not diplayed");
		}

		// Sex..Gender
		Thread.sleep(2000);
		WebElement genderElement = driver.findElement(By.xpath("//input[@value='female']"));
		if (genderElement.isDisplayed()) {
			genderElement.click();
			System.out.println("Click female button in genderElement field");
		} else {
			System.out.println("Sex..Gender field is not diplayed");
		}

		// City
		Thread.sleep(2000);
		WebElement City = driver.findElement(By.xpath("//select[@id='city']"));
		Select selectCity = new Select(City);
		if (City.isDisplayed()) {
			selectCity.selectByVisibleText("MUMBAI");
			System.out.println("Enter city name in cityname field");
		} else {
			System.out.println("City field is not diplayed");
		}

		// Course
		WebElement course = driver.findElement(By.xpath("//select[@id='course']"));
		Select selectCourse = new Select(course);
		if (course.isDisplayed()) {
			selectCourse.selectByIndex(1);
			System.out.println("Enter course name in coursename field");
		} else {
			System.out.println("Course field is not diplayed");
		}

		// District
		WebElement district = driver.findElement(By.xpath("//select[@id='district']"));
		Select selectdistrict = new Select(district);
		if (district.isDisplayed()) {
			selectdistrict.selectByVisibleText("GOA");
			System.out.println("Enter district name in district field");
		} else {
			System.out.println("District field is not diplayed");
		}

		// State
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select selectState = new Select(state);
		if (state.isDisplayed()) {
			selectState.selectByIndex(3);
			System.out.println("Enter state name in state field");
		} else {
			System.out.println("State field is not diplayed");
		}

		// PinCode
		WebElement PinCode = driver.findElement(By.xpath("//input[@id='pincode']"));
		if (PinCode.isDisplayed()) {
			PinCode.clear();
			PinCode.sendKeys("27028");
			System.out.println("Enter PinCode in PinCode field");
		} else {
			System.out.println("PinCode field is not diplayed");
		}

		// Email-ID
		WebElement email_id = driver.findElement(By.xpath("//input[@id='emailid']"));
		if (email_id.isDisplayed()) {
			email_id.clear();
			email_id.sendKeys("Amy@gmail.com");
			System.out.println("Enter email_id in email_id field");
		} else {
			System.out.println("Email-ID field is not diplayed");
		}

		WebElement submitButton = driver.findElement(By.xpath("//button[@class='bootbutton']"));
		if (submitButton.isDisplayed()) {
			submitButton.click();
			System.out.println("Clicked submit Button");
		} else {
			System.out.println("submitButton field is not diplayed");
		}
		Thread.sleep(4000);
		driver.close();
		System.out.println("TestScript for login and student register form is completed");
		driver.quit();

	}
    
	@Test (priority = 1)
	public static void errorLogin_FireBase_TestScript() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Chrome browser open");
		driver.get("https://qa-tekarch.firebaseapp.com");
		System.out.println("Url open in Chrome browser");

		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email_field\"]"));
		emailField.sendKeys("admin123@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("password_field"));
		passwordField.sendKeys("admin456");
		System.out.println("The password is invalid or the user does not have a password.");

		Thread.sleep(2000);
		WebElement loginElement = driver.findElement(By.xpath("//button[@onclick='login()']"));
		if (loginElement.isDisplayed()) {
			loginElement.click();
			System.out.println("Clicked login button");
		} else {
			System.out.println("Clicked login button is not displayed");
		}

		Thread.sleep(4000);

		Alert alert = driver.switchTo().alert();
		String expectedErrormsg = "Error : The password is invalid or the user does not have a password.";
		String actualErrormsg = alert.getText();
		alert.accept();

		if (actualErrormsg.equalsIgnoreCase(expectedErrormsg)) {
			System.out.println("testcase passed");
		} else {
			System.out.println("testcse failed");
		}

		driver.close();
		System.out.println("Test script is completed");

	}
	
	
	
	
	

}
