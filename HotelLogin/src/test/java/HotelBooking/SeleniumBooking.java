package HotelBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBooking {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	    driver = new FirefoxDriver();
		driver.get("file:///D:/aa/hotelBooking/hotelbooking.html");
		
		String tit = driver.getTitle();
		
		if(tit.contentEquals("Hotel Booking")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title unmatched");
		}
		
//		driver.findElement(By.name("txtFN")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.id("btnPayment")).click();
//		try {
//		 String msg = driver.switchTo().alert().getText();
//		 System.out.println(msg);
//		driver.switchTo().alert().accept();
//		}
//		finally {
//			driver.close();
//		}
	 
		try {
			Thread.sleep(1000);
			driver.findElement(By.name("txtFN")).sendKeys("");
			callAlert();
			Thread.sleep(1000);
			driver.findElement(By.name("txtFN")).sendKeys("Srujana");
			callAlert();
			Thread.sleep(1000);
			driver.findElement(By.name("txtLN")).sendKeys("");
			callAlert();
			Thread.sleep(1000);
			driver.findElement(By.name("txtLN")).sendKeys("Rangu");
			callAlert();
			Thread.sleep(1000);
			driver.findElement(By.name("Email")).sendKeys("srujana.com");
			callAlert();
			driver.findElement(By.name("Email")).clear();
			Thread.sleep(1000);
			driver.findElement(By.name("Email")).sendKeys("srujana@a.com");
			callAlert();
			Thread.sleep(300);
			driver.findElement(By.name("txtPhone")).sendKeys("8978063079");
			callAlert();
//			Select dropCity = new Select(driver.findElement(ByName("")));
			
			driver.navigate().to("file:///D:/aa/hotelBooking/success.html");
			driver.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void callAlert() {
		driver.findElement(By.className("btn")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
	}
	
		
		/*driver.findElement(By.name("txtLN")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();
		String msg1 = driver.switchTo().alert().getText();
		System.out.println(msg1);
		driver.switchTo().alert().accept();
		*/
		/*driver.findElement(By.name("txtEmail")).sendKeys("");
		  driver.findElement(By.className("btn")).click();
		String msg2 = driver.switchTo().alert().getText();
		System.out.println(msg2);
		driver.switchTo().alert().accept();*/
		
		//driver.findElement(By.name("Phone")).sendKeys("");
		//driver.findElement(By.className("btn")).click();
		//String msg3 = driver.switchTo().alert().getText();
		//System.out.println(msg3);
		//driver.switchTo().alert().accept();
		
	
	
}
