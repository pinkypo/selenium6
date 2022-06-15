package abcpack;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test {
	WebDriver d;
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://twitter.com/");
		d.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		// click on text
		d.findElement(By.name("text")).sendKeys("swathi");
	

}

	@BeforeMethod
	public void setUp1()
	{
			
		// Launch the browser
		
		 d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	}
	@AfterMethod
	public void tearDown1()
	{
		// Close the browser
		d.quit();
	}
	

}



