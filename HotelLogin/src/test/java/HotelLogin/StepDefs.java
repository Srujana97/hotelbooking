package HotelLogin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelLoginPageFactory;

public class StepDefs {
	
	WebDriver driver;
	HotelLoginPageFactory objhlpg;
	

	@Given("^User is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhlpg = new HotelLoginPageFactory(driver);
		driver.get("file:///D:/aa/hotelBooking/login.html");
		
		
		
	}

	@Then("^Check the heading of the page$")
	public void check_the_heading_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		
		
		String strheading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(strheading.contentEquals("Hotel Booking Application")) {
			System.out.println("***********"+"Heading matched");
		}
		else {
			System.out.println("********"+"Heading not matched");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.close();
		
		}
	}

/*	@Given("^User is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}*/

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		objhlpg.setPfuname("capgemini");
		objhlpg.setPfpwd("capg1234");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhlpg.setPflogin();
		driver.close();
	}

	@Then("^navigate to hotel booking$")
	public void navigate_to_hotel_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.navigate().to("file:///D:/aa/hotelBooking/hotelbooking.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		
		
	}

	@When("^user doesnot enter either username or password$")
	public void user_doesnot_enter_either_username_or_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		objhlpg.setPfuname("");
		Thread.sleep(1000);
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objhlpg.setPflogin();
		Thread.sleep(1000);
	}

	//@Then("^[a-z]$")
	@Then("^display approriate message$")
	public void display_approriate_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		String strheading = driver.findElement(By.xpath("//*[@id='userErrMsg']")).getText();
		assertEquals(strheading,"* Please enter userName.");
		driver.close();
		
	}

	/*@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
	}*/

	@When("^user enters incorrect username or password$")
	public void user_enters_incorrect_username_or_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		objhlpg.setPfuname("cg");
		objhlpg.setPfpwd("capg1234");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		objhlpg.setPflogin();
	}

	@Then("^dispaly login failed message$")
	public void dispaly_login_failed_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("*********"+alertMessage);
	}



}
