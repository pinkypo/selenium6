package abcpack1;

import java.sql.Connection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calender {
	WebDriver d;
	
	@Test
	public void testCalender() throws Exception
	
	{
		// Load web page
		d.get("https://www.southwest.com/");
		// Click on Flight
		//d.findElement(By.xpath("//span[contains(text(),'Flight Status')]")).click();
		
		d.findElement(By.xpath("//span[text()='Flight']")).click();
		Thread.sleep(3000);

}


@BeforeMethod
public void setUp()
{
	// Launch the browser
	d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
}
@AfterMethod
public void tearDown()
{
	// Close the browser
	d.quit();
}




}