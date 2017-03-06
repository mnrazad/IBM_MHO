package mho;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UserInputLoginRun {
	
	WebDriver mdriver = new FirefoxDriver();
	loginPageObjects lpg=new loginPageObjects(mdriver); 
	String TestUrl="http://10.12.7.25:8080/index.jsp";
	String partnerName="IBM US";
	String loginid; 
	String loginPass; 
	
	
	
	@Test
	public void userLogin()
	
	{
		
		// Taking input from the User
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your username....");
		loginid=scan.nextLine();
		System.out.println("Please enter your loginpassword....");
		loginPass=scan.nextLine();
		
		
	}
	
	
	
	@Test(dependsOnMethods = { "userLogin" })
	public void logintest(){
		
		
		
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
	
	@AfterMethod
	
	public void afterMethod(){
		//mdriver.quit();
		
	}

}
