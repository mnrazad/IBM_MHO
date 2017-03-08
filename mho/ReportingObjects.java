package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportingObjects {
		
		//WebDriver tdriver;	  
	
	//Monthly Usage; View usages report
	By Viewusagesreport1=By.xpath(".//*[@id='content']/div/div/div[1]/div[1]/p[2]/a");

	// Daily Usage; View usages report
	By Viewusagesreport2=By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/p[2]/a");

	//Daily Usage; Ticket Status Report
	By TicketGenerationStatus=By.xpath(".//*[@id='content']/div/div/div[1]/div[3]/p[2]/a");

	
	// Historical Volume Reports;Overview of service status and total usage
	By HistoricalCustomerVolumeReport=By.xpath(".//*[@id='content']/div/div/div[2]/div[2]/p/a");
	By HistoricalIDCVolumeReport=By.xpath(".//*[@id='content']/div/div/div[2]/div[3]/p/a");
	By HistoricalClientDeviceVolumeReport=By.xpath(".//*[@id='content']/div/div/div[2]/div[4]/p/a");


	//Suspended Client Device Report
	By SuspendedClientDeviceReport=By.xpath(".//*[@id='content']/div/div/div[2]/div[5]/p[2]/a");

 String TestUrl="http://10.12.7.25:8080/index.jsp";
     
   WebDriver tdriver;
 // Constructor to setup the Webdriver
    public ReportingObjects(WebDriver driver){
	 
	
	tdriver= driver; 
	tdriver.navigate().to(TestUrl);
	 
}

		
        	//Functions to get objects location of the Reporting page

   public WebElement getViewusagereport1(){
	   WebElement test = tdriver.findElement(Viewusagesreport1);
		 return test; 
		 }
   
   public WebElement getViewusagereport2(){
	   WebElement test = tdriver.findElement(Viewusagesreport2);
		 return test; 
		 }
   
   public WebElement getTicketGenerationStatius(){
	   WebElement test = tdriver.findElement(TicketGenerationStatus);
		 return test;
   }

   public WebElement getHistoricalCustomerVolumeReport(){
	   WebElement test = tdriver.findElement(HistoricalCustomerVolumeReport);
		 return test;
   }

   public WebElement getHistoricalIDCVolumeReport(){
	   WebElement test = tdriver.findElement(HistoricalIDCVolumeReport);
		 return test;
   }

   public WebElement getHistoricalClientDeviceVolumeReport(){
	   WebElement test = tdriver.findElement(HistoricalClientDeviceVolumeReport);
		 return test;
   }
   
   public WebElement getSuspendedClientDeviceReport(){
	   WebElement test = tdriver.findElement(SuspendedClientDeviceReport);
		 return test;
   }

   
   
   
   
   
   
   
   
   
   
   
}












