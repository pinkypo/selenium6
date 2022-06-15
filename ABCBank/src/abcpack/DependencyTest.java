package abcpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Load web page
		 d.get("https://demo.cyclos.org/ui/login");
		 d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
			// Enter password
			d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
			d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
			d.close();
			
		}
	     @Test(dependsOnMethods="login") 
	           public void sbi() throws Exception
	           {
	        	System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    		WebDriver d = new FirefoxDriver();
	        	
	        	d.get("https://accounts.google.com");
	        	d.close();
	        	 
	        	
	        
		
	}

}
