package mho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ReportingRun {
	
	
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
	public void bReporting() throws InterruptedException{
		
		
		System.out.println("Starting the Reporting Test.....");
		ReportingObjects roj=new ReportingObjects(mdriver);
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// clicking veritas netbackup and report
		mdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li[1]/a")).click();
		mdriver.findElement(By.xpath("//*[@id='ibm-content-main']/div/div[1]/ul/li[2]/a")).click();
			
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		// testing user report 1 
		
		roj.getViewusagereport1().click(); 
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// testing user report 2 
		
		roj.getViewusagereport2().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
		// testing ticket status link	
		
		roj.getTicketGenerationStatius().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//testing Historical Volume Report
		
		roj.getHistoricalCustomerVolumeReport().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//testing Historical ID Report
		roj.getHistoricalIDCVolumeReport().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//testing Historical Client Device Volume Report
		roj.getHistoricalClientDeviceVolumeReport().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//testing suspended client device Report
		roj.getSuspendedClientDeviceReport().click();
		Thread.sleep(2000);
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		System.out.println("Report test passed successfully");
		
		mdriver.quit();
					
	    }
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


