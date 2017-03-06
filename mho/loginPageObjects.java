package mho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPageObjects {
	
	
	// Objects for the login page
	 By userID=By.xpath(".//*[@id='uname']");
	 By password=By.xpath(".//*[@id='pw']");
	 By loginButton=By.xpath(".//*[@id='content']/table/tbody/tr/td[1]/form/table/tbody/tr[6]/td[2]/p/span/input");
	
	 // Objects for End Sesssion page 
	 By backToAdmin=By.linkText("Back to Admin Page");
	 
	 // Objects for parter and customer selection page 
	 
	 By partner=By.xpath(".//*[@id='beSelectId']");
	 By client=By.xpath(".//*[@id='subAccount']");
	 By goButton=By.xpath(".//*[@id='selbeform']/p[2]/input[1]");
			
	 
	 String TestUrl="http://10.12.7.25:8080/index.jsp";
	
	 
	 WebDriver tdriver;
	 
	  // Constructor to setup the Webdriver
	public loginPageObjects(WebDriver driver){
		 
		
		tdriver= driver; 
		tdriver.navigate().to(TestUrl);
		 
	}
	 
	 
	 
	  // Functions to get objects location for login page
	 
	 public WebElement getUserId(){
		 
		  WebElement userID = tdriver.findElement(By.xpath(".//*[@id='uname']"));
		 return userID ; 
		 
	 }
	  
	  public WebElement getPassword(){
			 
		  WebElement lastname = tdriver.findElement(By.xpath(".//*[@id='pw']"));
			 return lastname ; 
			 
		 }
	  
	  public WebElement getLoginbutton(){
			 
		  WebElement username = tdriver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[1]/form/table/tbody/tr[6]/td[2]/p/span/input"));
			 return username ; 
			 
		 }
	  
	  // functions for end session page 
	  
	  
	  public WebElement getBackToAdmin(){
			 
		  WebElement backToAdmin = tdriver.findElement(By.linkText("Back to Admin Page"));
			 return backToAdmin ; 
			 
		 }
	  
	  public WebElement getPartnerLocation(){
			 
		  WebElement backToAdmin = tdriver.findElement(By.xpath(".//*[@id='beSelectId']"));
			 return backToAdmin ; 
			 
		 }
	  
	  public WebElement getGoButton(){
			 
		  WebElement goButton = tdriver.findElement(By.xpath(".//*[@id='selbeform']/p[2]/input[1]"));
			 return goButton ; 
			 
		 }
	  
	  
	  

}
