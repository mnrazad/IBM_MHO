package mho;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Provisioning_Auto_Options {
	
	WebDriver mdriver = new FirefoxDriver();
	
	
	loginPageObjects lpg=new loginPageObjects(mdriver); 
	String TestUrl="http://10.12.7.25:8080/index.jsp";
	String loginid="AzadM";
	String loginPass="azad1234";
	String partnerName="IBM US";
	/*int x;
	int y;
	int z;*/
	
	
	/*@Test
	public void aa(){
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number for Backup Storage....");
		x=scan.nextInt();
		System.out.println("Please enter the number for Select a Service...");
		y=scan.nextInt();
		System.out.println("Please enter the number for  Select Offerting...");
		z=scan.nextInt();
		scan.close();
		
		
	}
	*/
	
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
		
		// backup storage, select a service, select offering 
		
		// indicates a required field
		
		 
		
		
		// element.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"55");
		
		for (int x=1;x<3;x++){
		for (int y=1;y<4;y++){
	    for (int z=1;y<3;z++){
			
	    	
	    	
	    	// choosing backup storage
			Select dd1=new Select(poj.getbackupstorage());
			dd1.selectByIndex(x);
			
			// choosing select a service
			Select dd2=new Select(poj.getselectService());
			dd2.selectByIndex(y);
			
			
			//choosing select offereing
			Select dd3=new Select(poj.getselectofferting());
			dd3.selectByIndex(z);
		
		// cleaning the objects 
			poj.getIBMaccount().clear();
			poj.getIBMworkNumb().clear();
			poj.getIBMcustomernumber().clear();
			poj.getClientDeviceName().clear();
			
			
			
		
		// loading new objects 
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// client device identification
		// get subaccount 
		
		
		Select dd4=new Select(poj.getsubaccount());
		dd4.selectByIndex(3);
		
		Thread.sleep(3000);
		
		// get ibmaccount,worknumber, customernumber
		
		//poj.getIBMaccount().sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"030102");
		
		poj.getIBMaccount().clear();
		//Thread.sleep(2000);
		poj.getIBMaccount().sendKeys("030102");
		
		poj.getIBMworkNumb().clear();
		poj.getIBMworkNumb().sendKeys("2524525252");
		
		poj.getIBMcustomernumber().clear();
		poj.getIBMcustomernumber().sendKeys("52424");
		
		Thread.sleep(3000);
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/* data center and service platform comes automatically
		data center, device category, service platform
		Select dd5=new Select(poj.getdatacenter());
		dd5.selectByVisibleText("Allen");
		Select dd6=new Select(poj.getserviceplatform());
		dd6.selectByVisibleText("ATTALL01A");*/
		
		
		// choosing device category
		Select dd7=new Select(poj.getdevicecategory());
		dd7.selectByVisibleText("Physical");
		
		
		//Select dd7 = new Select(mdriver.findElement(By.cssSelector("select[name='clientDevice.devicecategory']")));
		//dd7.selectByVisibleText("Physical");
		//poj.getdevicecategory().click();
		//mdriver.findElement(By.xpath("//tr[./td[contains(text(), 'Physical')]]//select")).click();
		
		
		// client device name, ip address, default gateway, netmask, client device location
		poj.getClientDeviceName().clear();
		poj.getClientDeviceName().sendKeys("Test");
		
		poj.getIpAddress().clear();
		poj.getIpAddress().sendKeys("192.168.1.2");
		
		poj.getdefaultgateway().clear(); 
		poj.getdefaultgateway().sendKeys("134.233.1.1");
		
		poj.getnetMask().clear();
		poj.getnetMask().sendKeys("10.10.10.10");
		
		
		Select dd8=new Select(poj.getClientDeviceLocation());
		dd8.selectByVisibleText("Inside Data Center");
		
		// Schedule ID handled 
		
		if(poj.getscheduleid().isDisplayed()== true){
			poj.getscheduleid().clear();
			poj.getscheduleid().sendKeys("3");
			System.out.println("Element is Present");
			}else{
			System.out.println("Element is Absent");
			}
		
		
		System.out.println("Done till schedule ID selection");
		
		
		
		
	
		Thread.sleep(3000);
		System.out.println("This is after the schedule ID");

		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//dd2.selectByVisibleText("Database");need to select service type again
		dd2.selectByIndex(y);
		
		
		
		System.out.println("Starting of the system information");
		

		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		Select dd9=new Select(poj.getOsVersion());
		dd9.selectByVisibleText("IBM AIX");
		
		
		Select dd10=new Select(poj.getclientdevicetype());
		dd10.selectByVisibleText("Web Server");
		
		poj.getserverMakeModel().clear();
		poj.getserverMakeModel().sendKeys("673467364");
		
		Select dd11=new Select(poj.getotherClient());
		dd11.selectByVisibleText("Active Cluster");
		
		Select dd12=new Select(poj.getVpnprovided());
		//dd12.selectByVisibleText("Customer");
		
		if(poj.getVpnprovided().isDisplayed()== true){
			dd12.selectByVisibleText("Customer");
			System.out.println("Vpn Provided Element is Present");
			}else{
			System.out.println("Vpn Provided Element is Absent");
			}
		
		
		System.out.println("System Informaiton Phase is done");
		
		// System Info phase is done
		
		// Backup information phase is starting
		poj.getrewgularfile().clear();
		poj.getrewgularfile().sendKeys("Test");
		
		if(mdriver.findElement(By.xpath(".//*[@id='backup.deduplication']")).isDisplayed()){
			WebElement duplication= mdriver.findElement(By.xpath(".//*[@id='backup.deduplication']"));
			Select ddtype=new Select(duplication);
			ddtype.selectByVisibleText("No");
			System.out.println("Duplication Element is Present");
			}else{
			System.out.println("Duplication Element is Absent");
			}
		
		Select dd13=new Select(poj.getEncryuption());
		dd13.selectByVisibleText("No");
		
		
		if(mdriver.findElement(By.xpath(".//*[@id='backup.replicate']")).isDisplayed()){
			WebElement replication= mdriver.findElement(By.xpath(".//*[@id='backup.replicate']"));
			Select ddtype=new Select(replication);
			ddtype.selectByVisibleText("No");
			System.out.println("Replicate Element is Present");
			}else{
			System.out.println("Replicate Element is Absent");
			}
		
		
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
		
		
		
		if(mdriver.findElements(By.xpath(".//*[@id='database.dbType']")).size()!=0){
			Select dbtype=new Select(poj.getdatabaseType());
			dbtype.selectByVisibleText("IBM DB2");
			System.out.println("Database type is Present");
			}else{
			System.out.println("Database type is Absent");
			}
		
		
		if(mdriver.findElements(By.xpath(".//*[@id='database.numOfDBsOnClient']")).size()!=0){
			poj.getDatabaseonClient().clear();
			poj.getDatabaseonClient().sendKeys("4");
			System.out.println("Database number of client is Present");
			}else{
			System.out.println("Database number of client is Absent");
			}
		
		
		
		
		if(mdriver.findElements(By.xpath(".//*[@id='database.numOfProcsOnClient']")).size()!=0){
			poj.getNumberProcessor().clear();
			poj.getNumberProcessor().sendKeys("43");
			System.out.println("Database number of processor  is Present");
			}else{
			System.out.println("Database number of processor is Absent");
			}
		
		// Log capture frequency
		
		if(mdriver.findElements(By.xpath(".//*[@id='database.logCapFreq']")).size()!=0){
		//(mdriver.findElement(By.xpath(".//*[@id='database.logCapFreq']")).isDisplayed()){
			WebElement LogCapFreq= mdriver.findElement(By.xpath(".//*[@id='database.logCapFreq']"));
			Select ddtype=new Select(LogCapFreq);
			ddtype.selectByVisibleText("Hours");
			System.out.println("Log Capture frequecy is Present");
			}else{
			System.out.println("Log Capture frequecy is Absent");
			}
		
		
		// log capture duration
		if(mdriver.findElements(By.xpath(".//*[@id='database.logCapDuration']")).size()!=0){
			WebElement LogCapture= mdriver.findElement(By.xpath(".//*[@id='database.logCapDuration']"));
			LogCapture.clear(); 
			LogCapture.sendKeys("3");
			System.out.println("Log capture duration is  is Present");
			}else{
			System.out.println("Log capture duration  is Absent");
			}
		
		// log capture location
		
		if(mdriver.findElements(By.xpath(".//*[@id='database.scptLogLoc']")).size()!=0){
			WebElement LogCaptureLoc= mdriver.findElement(By.xpath(".//*[@id='database.scptLogLoc']"));
			LogCaptureLoc.clear();
			 LogCaptureLoc.sendKeys("Test");
			System.out.println("log capture location  is Present");
			}else{
			System.out.println("log capture location is Absent");
			}
		
		
		
		
		poj.getsendform().click();
		
		Thread.sleep(4000);
		poj.getOkButton().click();
		
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String msg = mdriver.findElement(By.xpath(".//*[@id='content']/p[1]")).getText();
		System.out.println(msg);
		System.out.println("Provisioning Test Passed for combination " + " x= " + x +" y= " +  y + " z= " + z);
		
		Thread.sleep(3000);
		
		mdriver.navigate().back();
		
		mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
		
		}
		
		
		}
	
		mdriver.quit();
}}
