package mho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ANS_ProvisoningRun {

	

		WebDriver mdriver = new FirefoxDriver();
		loginPageObjects lpg=new loginPageObjects(mdriver); 
		String TestUrl="http://10.12.7.25:8080/index.jsp";
		String loginid="AzadM";
		String loginPass="azad1234";
		String partnerName="IBM US";
		String customerName="ACR Homes";
	
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
		
		//mdriver.findElement(By.xpath(".//*[@id='subAccount']")).click();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(mdriver,20);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='subAccount']")));
		Select dropdown1=new Select(lpg.getCustomerLocation());
		dropdown1.selectByVisibleText(customerName);
		
		lpg.getGoButton().click();
		System.out.println("Login Sucessfull");
		System.out.println("Ending the Login test.....");
	}

	@Test
	public void bProvisioning() throws InterruptedException{
		
		System.out.println("Starting the Provisioining Test.....");
		ProvisioningObjects poj=new ProvisioningObjects(mdriver);
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000); 
		// adding credentials to first login page
		mdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li/a")).click();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mdriver.findElement(By.xpath(".//*[@id='ibm-content-main']/div/div[1]/ul/li[3]/a")).click();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mdriver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[4]/td[2]/label")).click();
		
		
		
		//poj.getstartNewClient().click(); 
		mdriver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[15]/td[2]/input[7]")).click();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		// Starting the main test 
		
	// --------------------------------------------------------------------------------------------
		
		Select dd_backup=new Select(poj.getbackupstorage());
		dd_backup.selectByIndex(1);
		
		
		Select dd5 = new Select(mdriver.findElement(By.id("clientDevice.idccode")));
		dd5.selectByValue("ALILEO01");
		
		System.out.println("starting select service");
		
		WebDriverWait wait = new WebDriverWait(mdriver,20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selsvc")));
		Select dd2=new Select(mdriver.findElement(By.id("selsvc")));
				dd2.selectByValue("CATII");
				
				Thread.sleep(3000); 
				dd2.selectByValue("CATII");
		
	           Thread.sleep(3000); 
		
		
	           // System info
	           
	         mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   		Select dd9=new Select(poj.getOsVersion());
	   		dd9.selectByVisibleText("IBM AIX");
	   		
	   		
	   		Select dd10=new Select(poj.getclientdevicetype());
	   		dd10.selectByVisibleText("Web Server");
	   		
	   		poj.getserverMakeModel().sendKeys("673467364");
	   		
	   		Select dd11=new Select(poj.getotherClient());
	   		dd11.selectByVisibleText("Active Cluster");
		
		Thread.sleep(3000);
		//mdriver.quit();
		
		// backup info starting
		
		poj.getrewgularfile().sendKeys("Test");
		
		Select dd13=new Select(poj.getEncryuption());
		dd13.selectByVisibleText("No");
		
		Select bt1=new Select(poj.getbackuptimeselected1());
		bt1.selectByVisibleText("1 AM");
		
		
		Select bt2=new Select(poj.getbackuptimeselected2());
		bt2.selectByVisibleText("15");
		
		Select bt3=new Select(poj.getbackuptimeselected3());
		bt3.selectByVisibleText("5 AM");
		
		
		
		Select bt4=new Select(poj.getbackuptimeselected4());
		bt4.selectByVisibleText("15");
		
		Select vt=new Select(poj.getValutingOption());
		vt.selectByVisibleText("No");
		
	
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// database type info 
		System.out.println("Testing database type");
		Select dbtype=new Select(poj.getdatabaseType());
		dbtype.selectByVisibleText("IBM DB2");
		
		poj.getDatabaseonClient().sendKeys("4");
		poj.getNumberProcessor().sendKeys("43");
		
		
		System.out.println("Testing database type is done");
		
		Thread.sleep(3000); 
		poj.getsendform().click();
		
		Thread.sleep(4000);
		poj.getOkButton().click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}	
	


