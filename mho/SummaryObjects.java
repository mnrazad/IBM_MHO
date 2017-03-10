package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryObjects {   
	
	//Usage Summary for Current Month; Backup
	
	By  VolumethisMonth1=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[3]/a/img");
    By AverageDailyVolume1=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a/img");


    //Usage Summary for Current Month; Tape Output (Duplication) 

    By VolumethisMonth2=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[3]/a/img");
    By  AverageDailyVolume2=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[3]/a/img");

    
    //Usage Summary for Current Month; Restore 
    
    By VolumethisMonth3=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[8]/td[3]/a/img");
    By  AverageDailyVolume3=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[9]/td[3]/a/img");

     //Usage Summary for Current Month; Replication: 
    
    By VolumethisMonth4=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[11]/td[3]/a/img");
    By AverageDailyVolume4=By.xpath(".//*[@id='content']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[12]/td[3]/a/img");


    String TestUrl="http://10.12.7.25:8080/index.jsp";
    
    WebDriver tdriver;
  // Constructor to setup the Webdriver
     public SummaryObjects(WebDriver driver){
 	 
 	
 	tdriver= driver; 
 	tdriver.navigate().to(TestUrl);
 	 
 }

     //Functions to get objects location of the Summary page; Backup
     
     public WebElement getVolumethisMonth1(){
  	   WebElement test = tdriver.findElement(VolumethisMonth1);
  		 return test; 
  		 }
     
     public WebElement getAverageDailyVolume1(){
    	   WebElement test = tdriver.findElement(AverageDailyVolume1);
    		 return test; 
    		 }
     
     //Functions to get objects location of the Summary page; Tape Output (Duplication)
     
      public WebElement getVolumethisMonth2(){
    	   WebElement test = tdriver.findElement(VolumethisMonth2);
    		 return test; 
    		 }
     
      public WebElement getAverageDailyVolume2(){
    	   WebElement test = tdriver.findElement(AverageDailyVolume2);
    		 return test; 
    		 }
     
     //Functions to get objects location of the Summary page; Restore
     
     public WebElement getVolumethisMonth3(){
  	   WebElement test = tdriver.findElement(VolumethisMonth3);
  		 return test; 
  		 }
     
     public WebElement getAverageDailyVolume3(){
  	   WebElement test = tdriver.findElement(AverageDailyVolume3);
  		 return test; 
  		 }
     
      //Functions to get objects location of the Summary page; Replication
     
       public WebElement getVolumethisMonth4(){
    	   WebElement test = tdriver.findElement(VolumethisMonth4);
    		 return test; 
    		 }
       
       public WebElement getAverageDailyVolume4(){
      	   WebElement test = tdriver.findElement(AverageDailyVolume4);
      		 return test; 
      		 }
     
     
     
     














}
