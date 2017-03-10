package mho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


public class SummaryRun {
	
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
public void bSummary() throws InterruptedException{
	
	
	System.out.println("Starting the Summary Test.....");
	SummaryObjects soj=new SummaryObjects(mdriver);
	
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// clicking veritas netbackup and Summary
	mdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li[1]/a")).click();
	mdriver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div[1]/ul/li[1]/a")).click();
		
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	// testing Usage Summary for Current Month; /Backup
	
	soj.getVolumethisMonth1().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

    soj.getAverageDailyVolume1().click();
    Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	// testing Usage Summary for Current Month; /Tape Output (Duplication)
	
	soj.getVolumethisMonth2().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	soj.getAverageDailyVolume2().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	// testing Usage Summary for Current Month; /Restore
	
	soj.getVolumethisMonth3().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	soj.getAverageDailyVolume3().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	// testing Usage Summary for Current Month; /Replication
	
	soj.getVolumethisMonth4().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	soj.getAverageDailyVolume4().click();
	Thread.sleep(2000);
	mdriver.navigate().back();
	mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	System.out.println("Summary test passed successfully");
	mdriver.quit();


}
 }
