package abcpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclos extends Commons{
	
	@Test
	public void testLogin() throws Exception
	{
		// Load web page
		d.get("https://demo.cyclos.org/ui/login");
		// Click on Login
		d.findElement(By.id("login-link")).click();
		// Enter user name
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		// Enter password
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		//d.close();
		
	}
}

