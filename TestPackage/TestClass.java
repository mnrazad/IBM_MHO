package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass {

	public static void main(String[] args) {
		
		// Test code for the workspace 
		
		WebDriver driver=new FirefoxDriver(); 
		String TestUrl="http://10.12.7.25:8080/index.jsp";
		
		String loginid="AZAD";
		String loginPass="azad1234";
		
		// navigating to login home page 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		driver.navigate().to(TestUrl);
		driver.findElement(By.xpath(".//*[@id='uname']")).sendKeys(loginid);
		driver.findElement(By.xpath(".//*[@id='pw']")).sendKeys(loginPass);
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[1]/form/table/tbody/tr[6]/td[2]/p/span/input")).click();
		
	     try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// handling the end session
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Back to Admin Page")).click();	
		
		
		
	     try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// navigating to partner selection page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='beSelectId']")));
		dropdown.selectByVisibleText("IBM US");
		driver.findElement(By.xpath(".//*[@id='selbeform']/p[2]/input[1]")).click();
		
		
		
		
		System.out.println("Test is Completed");

	}

}
