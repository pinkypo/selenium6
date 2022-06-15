package abcpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReceivePayement extends Commons
{

	@Test
	public void testLogin() throws Exception
	{
		// Load web page
		d.get("https://demo.cyclos.org/ui/home");
		// Click on Login
		d.findElement(By.id("login-link")).click();
		// Enter user name
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		// Enter password
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		// Click on submit
		d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Pay user")).click();
		d.findElement(By.linkText("Receive payment")).click();
	 	d.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("John M Keynes");
	 	Thread.sleep(2000);
	 	d.findElement(By.linkText("John M Keynes")).click();
		Thread.sleep(2000);
	     d.findElement(By.xpath("//input[@placeholder='0,00']")).sendKeys("000");
		// Click on Next button
	     d.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		Thread.sleep(3000);
	}






}






