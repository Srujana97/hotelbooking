package HotelBooking;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;


public class StepDefs {

	
	WebDriver driver;
	HotelBookingPageFactory objhbpg;
	
@Before
@Given("^User is on th e hotel booking form$")
public void user_is_on_th_e_hotel_booking_form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objhbpg = new HotelBookingPageFactory(driver);
	driver.get("file:///D:/aa/hotelBooking/hotelbooking.html");
}

@Then("^Check the heading of the page$")
public void check_the_heading_of_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
	String strheading = driver.findElement(By.xpath("html/body/div[1]/h2")).getText();
	if(strheading.contentEquals("Hotel Booking Form")) {
		System.out.println("***********"+"Heading matched");
	}
	else {
		System.out.println("********"+"Heading not matched");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	
	}
}

@Given("^User must enter valid firstname$")
public void user_must_enter_valid_firstname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	objhbpg.setPfname("Srujana");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	objhbpg.setPcfbooking();
	
	
}

@When("^User enters invalid details$")
public void user_enters_invalid_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
	objhbpg.setPfname("");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	objhbpg.setPcfbooking();
	driver.close();
}

@Then("^Navigate to hotel booking form$")
public void navigate_to_hotel_booking_form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
	driver.navigate().to("file:///D:/aa/hotelBooking/hotelbooking.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.close();
	
}

@Given("^User is on hotel booking page$")
public void user_is_on_hotel_booking_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	objhbpg.setPfname("Srujana");Thread.sleep(1000);
	objhbpg.setPlname("Rangu");Thread.sleep(1000);
	objhbpg.setPemail("srujana@a.com");Thread.sleep(1000);
	objhbpg.setPphone("8978063079");Thread.sleep(1000);
	objhbpg.setPcity("Pune");Thread.sleep(1000);
	objhbpg.setPstate("Maharashtra");Thread.sleep(1000);
	objhbpg.setPchname("srujana");Thread.sleep(1000);
	objhbpg.setPdebit("123456789098");Thread.sleep(1000);
	objhbpg.setPcvv("122");Thread.sleep(1000);
	objhbpg.setPmonth("03");Thread.sleep(1000);
	objhbpg.setPyear("2020");Thread.sleep(1000);
	objhbpg.setPcfbooking();
	Thread.sleep(1000);
	
	
	
}

@Then("^Navigate to Welcome page$")
public void navigate_to_Welcome_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.navigate().to("file:///D:/aa/hotelBooking/hotelbooking.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.close();
	
}

@When("^User leaves first name blank$")
public void user_leaves_first_name_blank() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	objhbpg.setPlname("");
	Thread.sleep(1000);
	
}

@When("^Clicks the button$")
public void clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	objhbpg.setPcfbooking();
}

@Then("^Display alert message$")
public void display_alert_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println("*********"+alertMessage);

}

@When("^User leaves last Name blank and clicks the button$")
public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	objhbpg.setPfname("FGGH");
	Thread.sleep(1000);
	objhbpg.setPlname("");
	Thread.sleep(1000);
	objhbpg.setPcfbooking();
	
}

@Then("^Display alert msg$")
public void display_alert_msg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println("*********"+alertMessage);
}

@When("^User enters all data$")
public void user_enters_all_data() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters incorrect email format and clicks the button$")
public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User leaves MobileNo blank and  clicks the button$")
public void user_leaves_MobileNo_blank_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	objhbpg.setPfname("FGGH");
	Thread.sleep(1000);
	objhbpg.setPlname("sgjhkjkj");
	Thread.sleep(1000);
	objhbpg.setPphone("");
	Thread.sleep(1000);
	objhbpg.setPcfbooking();
}

@When("^User enetrs incorrect mobile format with greater than (\\d+) digits and click the button$")
public void user_enetrs_incorrect_mobile_format_with_greater_than_digits_and_click_the_button(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters incorrect mobileNo and  clicks the button$")
public void user_enters_incorrect_mobileNo_and_clicks_the_button(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    //throw new PendingException();
	
	objhbpg.setPfname("Srujana");
	objhbpg.setPlname("Srujana");
	objhbpg.setPemail("Srujana@gmail.com");
	List<String> objList = arg1.asList(String.class);
	objhbpg.setPcfbooking();
	
	
	for(int i = 0; i<objList.size();i++) {
		if(Pattern.matches("^[7-9]{1}[0-9]{9}$",objList.get(i))) {
			System.out.println("*****Matched"+objList.get(i)+"*******");
		}
		else {
			System.out.println("*******Not Matched"+objList.get(i)+"*******");
			
			
		}
	}
	
}

@Given("^User is on the hotel booking page$")
public void user_is_on_the_hotel_booking_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User does not select any city and clicks the button$")
public void user_does_not_select_any_city_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User does not select any state and clicks the button$")
public void user_does_not_select_any_state_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User doesnot select city$")
public void user_doesnot_select_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters (\\d+)$")
public void user_enters(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^Allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User leaves CardHolderName blank and clicks the button$")
public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User leaves CardHolderNumber blank and clicks the button$")
public void user_leaves_CardHolderNumber_blank_and_clicks_the_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}


}
