package mho;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class provisionAccount_run {
	
	WebDriver mdriver = new FirefoxDriver();
	loginPageObjects lpg=new loginPageObjects(mdriver); 
	String TestUrl="http://10.12.7.25:8080/index.jsp";
	String loginid="AzadM";
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
	public void bProvisioning() throws InterruptedException{
		
		
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
		
		Select dropDown = new Select(poj.getsubaccount());
		List<WebElement> elementCount = dropDown.getOptions();
		System.out.println("Number of items: " + elementCount.size());

	
		
		
		for (int x=2;x<5;x++){
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select dd1=new Select(poj.getbackupstorage());
		poj.getbackupstorage().clear();
		dd1.selectByVisibleText("Tape");
		
		//Thread.sleep(3000);
		poj.getselectService().clear();
		Select dd2=new Select(poj.getselectService());
		//dd2.deselectAll();
		dd2.selectByValue("CATII");
		
		
		
		//mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		poj.getselectofferting().clear();
		Select dd3=new Select(poj.getselectofferting());
		dd3.selectByVisibleText("Remote");
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// client device identification
		poj.getsubaccount().clear();
		Select dd4=new Select(poj.getsubaccount());
		//dd4.selectByVisibleText("APL LIMITED");
		//dd4.selectByValue("182821");
		dd4.selectByIndex(x);
		//dd4.selectByValue("182626");
		
		poj.getIBMaccount().clear();
		poj.getIBMaccount().sendKeys("030102");
		
		poj.getIBMworkNumb().clear();
		poj.getIBMworkNumb().sendKeys("2524525252");
		
		poj.getIBMcustomernumber().clear();
		poj.getIBMcustomernumber().sendKeys("52424");
		
		
		//mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// data center, device category, service platform
		//Select dd5=new Select(poj.getdatacenter());
		//dd5.selectByVisibleText("Allen");
		
		
		//Select dd6=new Select(poj.getserviceplatform());
		//dd6.selectByVisibleText("ATTALL01A");
		poj.getdevicecategory().clear();
		Select dd7=new Select(poj.getdevicecategory());
		dd7.selectByVisibleText("Physical");
		
		
		//Select dd7 = new Select(mdriver.findElement(By.cssSelector("select[name='clientDevice.devicecategory']")));
		//dd7.selectByVisibleText("Physical");
		//poj.getdevicecategory().click();
		//mdriver.findElement(By.xpath("//tr[./td[contains(text(), 'Physical')]]//select")).click();
		
		
		// client device name 
		
		poj.getClientDeviceName().sendKeys("Test");
		poj.getIpAddress().sendKeys("192.168.1.2");
		poj.getdefaultgateway().sendKeys("134.233.1.1");
		poj.getnetMask().sendKeys("10.10.10.10");
		Select dd8=new Select(poj.getClientDeviceLocation());
		dd8.selectByVisibleText("Inside Data Center");
		//poj.getscheduleid().sendKeys("3");
		
		//182626
		if(poj.getscheduleid().isDisplayed()== true){
			poj.getscheduleid().sendKeys("3");
			System.out.println("Element is Present");
			}else{
			System.out.println("Element is Absent");
			}
		
		
		
		
		
		
		
	
		Thread.sleep(3000);
		System.out.println("This is after the schedule ID");

		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dd2.selectByVisibleText("Database");
		
		System.out.println("This is after the second selection");
		//dd2.selectByVisibleText("File System");

		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// system informaiton 
		
		Select dd9=new Select(poj.getOsVersion());
		dd9.selectByVisibleText("IBM AIX");
		
		
		Select dd10=new Select(poj.getclientdevicetype());
		dd10.selectByVisibleText("Web Server");
		
		poj.getserverMakeModel().sendKeys("673467364");
		
		
		// 
		
		Select dd11=new Select(poj.getotherClient());
		dd11.selectByVisibleText("Active Cluster");
		
		Select dd12=new Select(poj.getVpnprovided());
		dd12.selectByVisibleText("Customer");
		
		// regular file system
		
		poj.getrewgularfile().sendKeys("Test");
		
		Select dd13=new Select(poj.getEncryuption());
		dd13.selectByVisibleText("No");
		
		// Backup time selection
		
		
		Select bt1=new Select(poj.getbackuptimeselected1());
		bt1.selectByVisibleText("1 AM");
		
		
		Select bt2=new Select(poj.getbackuptimeselected2());
		bt2.selectByVisibleText("15");
		
		Select bt3=new Select(poj.getbackuptimeselected3());
		bt3.selectByVisibleText("5 AM");
		
		
		
		Select bt4=new Select(poj.getbackuptimeselected4());
		bt4.selectByVisibleText("15");
		
		
		
		// vaulting option 
		
		Select vt=new Select(poj.getValutingOption());
		vt.selectByVisibleText("No");
		
		// database type 
		
		Select dbtype=new Select(poj.getdatabaseType());
		dbtype.selectByVisibleText("IBM DB2");
		
		poj.getDatabaseonClient().sendKeys("4");
		poj.getNumberProcessor().sendKeys("43");
		poj.getsendform().click();
		
		Thread.sleep(4000);
		poj.getOkButton().click();
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String msg = mdriver.findElement(By.xpath(".//*[@id='content']/p[1]")).getText();
		System.out.println(msg);
		
		mdriver.navigate().back();
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// code is done
		}
		Thread.sleep(3000);
		System.out.println("Provisioning Test Passed");
		
		mdriver.quit();
		
	}
	

}
