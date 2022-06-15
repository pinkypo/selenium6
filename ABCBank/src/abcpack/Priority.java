package abcpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	public void meth1()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://jqueryui.com/slider/");
		
	     }
	@Test(priority=1)
	public void meth2()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	
			//load the web page
	   		d.get("https://retail.onlinesbi.com/retail/login.htm");
	    }
	@Test(priority=4)
	public void meth3()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		// Load web page
		 d.get("https://demo.cyclos.org/ui/login");
	    }
	@Test(priority=2)
	public void meth4()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
    	
    	d.get("https://accounts.google.com");
    	
	}

}
