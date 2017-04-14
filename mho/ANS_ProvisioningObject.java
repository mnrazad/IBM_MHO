package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ANS_ProvisioningObject {

	// add a new service on an existing client device
	


	By addaNewServiceonanExistingClientDevice=By.xpath(".//*[@id='content']/form/table/tbody/tr[4]/td[2]/label");

	// Indicates a required field
	
	 By BackUpStorage=By.xpath(".//*[@id='primarystorage']");
	 
	// Client device identification 
	 
	 By DataCenter=By.xpath(".//*[@id='clientDevice.idccode']");

	 String TestUrl="http://10.12.7.25:8080/index.jsp";



	 WebDriver tdriver;
	 
	  // Constructor to setup the Webdriver
	public  ANS_ProvisioningObject(WebDriver driver){
		 
		
		tdriver= driver; 
		tdriver.navigate().to(TestUrl);
		 








}
}

