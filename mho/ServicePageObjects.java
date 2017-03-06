package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicePageObjects {
	
	
	WebDriver tdriver;
	 
	  // Constructor to setup the Webdriver
	public ServicePageObjects(WebDriver driver){
		 
		
		tdriver= driver; 
	
		 
	}
	 
	 
	 
	  // Functions to get objects location for login page
	 
	 public WebElement getVeritus(){
		 
		  WebElement veritusNet= tdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li[1]/a"));
		 return veritusNet ; 
		 
	 }
	  
	  public WebElement getservice(){
			 
		  WebElement serviceObject = tdriver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/ul/li[1]/a"));
			 return serviceObject ; 
			 
		 }
	  
}
	  
	  