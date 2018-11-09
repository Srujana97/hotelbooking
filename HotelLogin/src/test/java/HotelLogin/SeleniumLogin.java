package HotelLogin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/aa/hotelBooking/login.html");
	
		String strheading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText() ;
		if(strheading.contentEquals("Hotel Booking Application")) {
			System.out.println("Heading Matched");
			
		}
		else {
			System.out.println("Heading Not Matched");
		}
		
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//driver.findElement(By.name("userPwd")).sendKeys("capg124");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//driver.close();
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		/*
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		*/
		driver.navigate().to("file:///D:/aa/hotelBooking/hotelbooking.html");
		//driver.quit();
		//driver.close();
		
		
		
	}

}
