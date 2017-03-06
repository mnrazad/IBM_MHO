package moonLight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProvisioningRun {
	
	WebDriver mdriver = new FirefoxDriver();
	loginPageObjects lpg=new loginPageObjects(mdriver); 
	String TestUrl="http://10.12.7.25:8080/index.jsp";
	String loginid="AZAD";
	String loginPass="azad1234";
	String partnerName="IBM US";
	
	
	@Test
	public void alogintest(){
		
		
		System.out.println("Starting the Login Test.....");
		loginPageObjects lpg=new loginPageObjects(mdriver);
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// adding credentials to first login page
		lpg.getUserId().sendKeys(loginid);
		lpg.getPassword().sendKeys(loginPass);
		lpg.getLoginbutton().click(); 
		
		// navigating to Endsession page 
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpg.getBackToAdmin().click(); 
		
		// navigating to partner and customer selection 
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select dropdown=new Select(lpg.getPartnerLocation());
		dropdown.selectByVisibleText(partnerName);
		lpg.getGoButton().click();
		System.out.println("Login Sucessfull");
		System.out.println("Ending the Login test.....");
	}
	
	@Test
	public void bProvisioning(){
		
		
		System.out.println("Starting the Provisioining Test.....");
		ProvisioningObjects poj=new ProvisioningObjects(mdriver);
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// adding credentials to first login page
		mdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li[1]/a")).click();
		mdriver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div[1]/ul/li[3]/a")).click();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		poj.getstartNewClient().click(); 
		mdriver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[15]/td[2]/input[7]")).click();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// starting the main page 
		
		// indicates a required field
		Select dd1=new Select(poj.getbackupstorage());
		dd1.selectByVisibleText("Tape");
		Select dd2=new Select(poj.getselectService());
		dd2.selectByVisibleText("Database");
		
		//mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select dd3=new Select(poj.getselectofferting());
		dd3.selectByVisibleText("Remote");
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// client device identification
		
		Select dd4=new Select(poj.getsubaccount());
		dd4.selectByVisibleText("Customer001");
		poj.getIBMaccount().sendKeys("030102");
		poj.getIBMworkNumb().sendKeys("2524525252");
		poj.getIBMcustomernumber().sendKeys("52424");
		
		
		//mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// data center, device category, service platform
		Select dd5=new Select(poj.getdatacenter());
		dd5.selectByVisibleText("Allen");
		
		
		Select dd6=new Select(poj.getserviceplatform());
		dd6.selectByVisibleText("ATTALL01A");
		
		Select dd7=new Select(poj.getdevicecategory());
		dd7.selectByVisibleText("Physical");
		
		
		//poj.getdevicecategory().click();
		//mdriver.findElement(By.xpath(".//*[@id='clientDevice.devicecategory']/option[2]")).click();
		
		
		// client device name 
		
		poj.getClientDeviceName().sendKeys("Test");
		poj.getIpAddress().sendKeys("192.168.1.2");
		poj.getdefaultgateway().sendKeys("134.233.1.1");
		poj.getnetMask().sendKeys("10.10.10.10");
		Select dd8=new Select(poj.getClientDeviceLocation());
		dd8.selectByVisibleText("Inside Data Center");
		poj.getscheduleid().sendKeys("3");
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
