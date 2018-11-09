package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPageFactory {
	
	//identifying elements
	WebDriver driver;
	@FindBy(name = "userName")
	@CacheLookup
	WebElement pfuname;
	
	
	//using how class
	@FindBy(how = How.NAME,using = "userPwd")
	@CacheLookup
	WebElement pfpwd;
	
	@FindBy(className = "btn")
	@CacheLookup
	WebElement pflogin;

	public HotelLoginPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPfuname() {
		return pfuname;
	}

	public void setPfuname(String suname) {
		pfuname.sendKeys(suname);
	}

	public WebElement getPfpwd() {
		return pfpwd;
	}

	public void setPfpwd(String spwd) {
		 pfpwd.sendKeys(spwd);
	}

	public WebElement getPflogin() {
		return pflogin;
	}

	public void setPflogin() {
		pflogin.click();
	}
	
	
	
	
	

}
