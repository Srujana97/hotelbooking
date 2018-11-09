package pageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPageFactory {

	
	WebDriver driver;
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement pfname;
	
	@FindBy(name = "txtLN")
	@CacheLookup
	WebElement plname;
	
	@FindBy(name = "Email")
	@CacheLookup
	WebElement pemail;
	
	
	@FindBy(name = "Phone")
	@CacheLookup
	WebElement pphone;
	
	/*@FindBy(By.xpath("html/body/div[1]/div/form/table/tbody/tr[6]/td[2]/textarea")).getText();
	@CacheLookup
	WebElement pemail;
	*/
	@FindBy(name = "city")
	@CacheLookup
	WebElement pcity;
	
	@FindBy(name = "state")
	@CacheLookup
	WebElement pstate;
	
	
	@FindBy(name = "persons")
	@CacheLookup
	WebElement ppersons;
	
	

	@FindBy(id = "txtCardholderName")
	@CacheLookup
	WebElement pchname;
	
	@FindBy(name = "debit")
	@CacheLookup
	WebElement pdebit;
	
	@FindBy(name = "cvv")
	@CacheLookup
	WebElement pcvv;
	
	@FindBy(name = "month")
	@CacheLookup
	WebElement pmonth;
	
	@FindBy(name = "year")
	@CacheLookup
	WebElement pyear;
	
	@FindBy(id = "btnPayment")
	@CacheLookup
	WebElement pcfbooking;

	public HotelBookingPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPfname() {
		return pfname;
	}

	public void setPfname(String sfname) {
		pfname.sendKeys(sfname);
	}

	public WebElement getPlname() {
		return plname;
	}

	public void setPlname(String slname) {
		plname.sendKeys(slname);
	}

	public WebElement getPemail() {
		return pemail;
	}

	public void setPemail(String semail) {
		 pemail.sendKeys(semail);;
	}

	public WebElement getPphone() {
		return pphone;
	}

	public void setPphone(String sphone) {
		pphone.sendKeys(sphone);
	}

	public WebElement getPcity() {
		return pcity;
	}

	public void setPcity(String scity) {
		pcity.sendKeys(scity);;
	}

	public WebElement getPstate() {
		return pstate;
	}

	public void setPstate(String sstate) {
		pstate.sendKeys(sstate); ;
	}

	public WebElement getPpersons() {
		return ppersons;
	}

	public void setPpersons(String spersons) {
		ppersons.sendKeys(spersons);;
	}

	public WebElement getPchname() {
		return pchname;
	}

	public void setPchname(String schname) {
		 pchname.sendKeys(schname);;
	}

	public WebElement getPdebit() {
		return pdebit;
	}

	public void setPdebit(String sdebit) {
		pdebit.sendKeys(sdebit);;
	}

	public WebElement getPcvv() {
		return pcvv;
	}

	public void setPcvv(String scvv) {
		pcvv.sendKeys(scvv);
	}

	public WebElement getPmonth() {
		return pmonth;
	}

	public void setPmonth(String smonth) {
		pmonth.sendKeys(smonth);
	}

	public WebElement getPyear() {
		return pyear;
	}

	public void setPyear(String syear) {
		pyear.sendKeys(syear);;
	}

	public WebElement getPcfbooking() {
		return pcfbooking;
	}

	public void setPcfbooking() {
		pcfbooking.click();
	}
	
	
	
}
