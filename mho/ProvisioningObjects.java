package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProvisioningObjects {
	
	
	// start new client device
	By startNewClient=By.xpath(".//*[@id='reqtype1']");
	 
	 // Indicates a required field 
	
	 By BackUpStorage=By.xpath(".//*[@id='primarystorage']");
	 By SelectSerivce=By.xpath(".//*[@id='selsvc']");
	 By SelectOffering=By.xpath(".//*[@id='seloff']");
	
	 // Client device identification 
	 By SubAccount=By.xpath(".//*[@id='clientDevice.subaccount1']");
	 By IBMAccountNumb=By.xpath(".//*[@id='clientDevice.ibmcontractnumber']");
	 By IBMWorkNumb=By.xpath(".//*[@id='clientDevice.ibmworknumber']");
	 
	 
	 By IBMCustomerNumb=By.xpath(".//*[@id='clientDevice.ibmcustomernumber']");
	 By DataCenter=By.xpath(".//*[@id='addcustomerform']");
	 By serviceplatform=By.xpath(".//*[@id='clientDevice.servicePlatform']");
	 By DeviceCategory=By.xpath(".//*[@id='clientDevice.devicecategory']");
	 
	 //---------------------------------------------------
	 
	 // object for client device name
	 
	 By ClientDeviceName=By.xpath(".//*[@id='clientDevice.hostname']");
	 By IPAddress=By.xpath(".//*[@id='clientDevice.ipaddress']");
	 By defaultGateway=By.xpath(".//*[@id='clientDevice.gateway']");
	 By netMask=By.xpath(".//*[@id='clientDevice.netmask']");
	 By clientDeviceLocation=By.xpath(".//*[@id='clientDevice.hostlocation']");
	 By scheduleid=By.xpath(".//*[@id='clientDevice.scheduleId']");
	 
	 
	 // object after the first stage 
	 //----------------------------------------------------------------------------------------------------
	 	
	 // System Information 
	 
	 By OsVersion=By.xpath(".//*[@id='systemInfo.osversion']");
	 By ClientDeviceType=By.xpath(".//*[@id='systemInfo.servertype']");
	 By ServerMakeModel=By.xpath(".//*[@id='systemInfo.servermake']");
	 By otherClient=By.xpath(".//*[@id='systemInfo.serversetup']");
	 By vpnProvided=By.xpath(".//*[@id='systemInfo.vpnProvidedBy']");
	 
	 
	 // Backup Information objects 
	 
	 By RegularFile=By.xpath(".//*[@id='backup.filesystem']");
	 By Encryption=By.xpath(".//*[@id='backup.encryption']");
	 By backuptimeselected1=By.xpath(".//*[@id='windowsel_FH']");
	 By backuptimeselected2=By.xpath(".//*[@id='windowsel_FM']");
	 By backuptimeselected3=By.xpath(" .//*[@id='windowsel_TH']");
	 By backuptimeselected4=By.xpath(" .//*[@id='windowsel_TM']");
	 By vaultingOption=By.xpath(".//*[@id='backup.tapevaulting']");
	 
	 // database information obejcts 
	 
	 
	 By DatabaseType=By.xpath(".//*[@id='database.dbType']");
	 By DatabaseOnclient=By.xpath(".//*[@id='database.numOfDBsOnClient']");
	 By NumberProcssor=By.xpath(".//*[@id='database.numOfProcsOnClient']");
	
	 // clicking on the Okay button
	 By sendformbutton=By.xpath(".//*[@id='submit_button']");
	 By OkButton=By.xpath(".//*[@id='okButton_label']");
	 String TestUrl="http://10.12.7.25:8080/index.jsp";
	
	 
	 WebDriver tdriver;
	 
	  // Constructor to setup the Webdriver
	public ProvisioningObjects(WebDriver driver){
		 
		
		tdriver= driver; 
		tdriver.navigate().to(TestUrl);
		 
	}
	 
	 
	 
	  // Functions to get objects location of the provisoining page
	public WebElement getbackupstorage(){
		 
		  WebElement test = tdriver.findElement(BackUpStorage);
		 return test; 
		 
	 }
	 public WebElement getstartNewClient(){
		 
		  WebElement startnewclient = tdriver.findElement(startNewClient);
		 return startnewclient; 
		 
	 }
	  
	  public WebElement getselectService(){
			 
		  WebElement selectService = tdriver.findElement(SelectSerivce);
			 return selectService ; 
			 
		 }
	  
	  public WebElement getselectofferting(){
			 
		  WebElement test = tdriver.findElement(SelectOffering);
			 return test ; 
			 
		 }
	  
	  // Client device identification
	  
	  
	  public WebElement getsubaccount(){
			 
		  WebElement test = tdriver.findElement(SubAccount);
			 return test ; 
			 
		 }
	  // get ibm contract number
	  public WebElement getIBMaccount(){
			 
		  WebElement test = tdriver.findElement(IBMAccountNumb);
			 return test ; 
			 
		 }
	  // get ibm worknumber
	  public WebElement getIBMworkNumb(){
			 
		  WebElement test = tdriver.findElement(IBMWorkNumb);
			 return test ; 
			 
		 }
	  
	  public WebElement getIBMcustomernumber(){
			 
		  WebElement test = tdriver.findElement(IBMCustomerNumb);
			 return test ; 
			 
		 }
	  
	  
	  // functions for service category, device category, 
	  
	  public WebElement getdatacenter(){
			 
		  WebElement test = tdriver.findElement(DataCenter);
			 return test ; 
			 
		 }
	  
	  public WebElement getserviceplatform(){
			 
		  WebElement test = tdriver.findElement(serviceplatform);
			 return test ; 
			 
		 }public WebElement getdevicecategory(){
			 
		  WebElement test = tdriver.findElement(DeviceCategory);
			 return test ; 
			 
		 }
		 
		 //-----------------------------------------------------------------------------
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  // functions for client device name 
	  
	  public WebElement getClientDeviceName(){
			 
		  WebElement test = tdriver.findElement(ClientDeviceName);
			 return test ; 
			 
		 }
	  
	  public WebElement getIpAddress(){
			 
		  WebElement test = tdriver.findElement(IPAddress);
			 return test ; 
			 
		 }
	  public WebElement getdefaultgateway(){
			 
		  WebElement test = tdriver.findElement(defaultGateway);
			 return test ; 
			 
		 }
	  public WebElement getnetMask(){
			 
		  WebElement test = tdriver.findElement(netMask);
			 return test ; 
			 
		 }
	  public WebElement getClientDeviceLocation(){
			 
		  WebElement test = tdriver.findElement(clientDeviceLocation);
			 return test ; 
			 
		 }
	  
	  public WebElement getscheduleid(){
			 
		  WebElement test = tdriver.findElement(scheduleid);
			 return test ; 
			 
		 }
	  
	  // System information page 
	  
	  public WebElement getOsVersion(){
			 
		  WebElement test = tdriver.findElement(OsVersion);
			 return test ; 
			 
		 }
	  public WebElement getclientdevicetype(){
			 
		  WebElement test = tdriver.findElement(ClientDeviceType);
			 return test ; 
			 
		 }
	  public WebElement getserverMakeModel(){
			 
		  WebElement test = tdriver.findElement(ServerMakeModel);
			 return test ; 
			 
		 }
	  public WebElement getotherClient(){
			 
		  WebElement test = tdriver.findElement(otherClient);
			 return test ; 
			 
		 }
	  
	  public WebElement getVpnprovided(){
			 
		  WebElement test = tdriver.findElement(vpnProvided);
			 return test ; 
			 
		 }
	  
	  
	  // Backup informaton object 
	  
	  public WebElement getrewgularfile(){
			 
		  WebElement test = tdriver.findElement(RegularFile);
			 return test ; 
			 
		 }
	  
	  public WebElement getEncryuption(){
			 
		  WebElement test = tdriver.findElement(Encryption);
			 return test ; 
			 
		 }
	  
	  public WebElement getbackuptimeselected1(){
			 
		  WebElement test = tdriver.findElement(backuptimeselected1);
			 return test ; 
			 
		 }
	  
	  public WebElement getbackuptimeselected2(){
			 
		  WebElement test = tdriver.findElement(backuptimeselected2);
			 return test ; 
			 
		 }
	  
	  public WebElement getbackuptimeselected3(){
			 
		  WebElement test = tdriver.findElement(backuptimeselected3);
			 return test ; 
			 
		 }
	  
	  public WebElement getbackuptimeselected4(){
			 
		  WebElement test = tdriver.findElement(backuptimeselected4);
			 return test ; 
			 
		 }
	  
	  public WebElement getValutingOption(){
			 
		  WebElement test = tdriver.findElement(vaultingOption);
			 return test ; 
			 
		 }
	  
	  // database information objects 
	  
	  
	  public WebElement getdatabaseType(){
			 
		  WebElement test = tdriver.findElement(DatabaseType);
			 return test ; 
			 
		 }
	  
	  public WebElement getDatabaseonClient(){
			 
		  WebElement test = tdriver.findElement(DatabaseOnclient);
			 return test ; 
			 
		 }
	  
	  public WebElement getNumberProcessor(){
			 
		  WebElement test = tdriver.findElement(NumberProcssor);
			 return test ; 
			 
		 }
	  
	  
	 
	  public WebElement getsendform(){
			 
		  WebElement test = tdriver.findElement(sendformbutton);
			 return test ; 
			 
		 }
	  
	  
	  
	  
	  public WebElement getOkButton(){
			 
		  WebElement test = tdriver.findElement(OkButton);
			 return test ; 
			 
		 }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
