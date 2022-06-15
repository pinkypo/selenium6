package abcpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Commons {
	WebDriver d;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) // it will lounch the browser
	{
		//louch the broswer
		if(browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			d= new FirefoxDriver();
		}
		else if(browser.equals("CD"))
		{
			d= new ChromeDriver();
		}
	else if(browser.equals("Edge"))
	{
		d= new EdgeDriver();

}
		
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	}
	
	@AfterMethod
	public void tearDown() // it will kill the browser
	{
		// Close the browser
		d.quit();
	}

}