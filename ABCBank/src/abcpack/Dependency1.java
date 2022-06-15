package abcpack;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dependency1 {
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://jqueryui.com/slider/");
		assertEquals(d.getTitle(),"Slider | jQuery UI");
		// Switch driver focus to frame
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		a.dragAndDropBy(d.findElement(By.xpath("//div[@id='slider']/span")),300, 0).perform();
		

}
	  @Test(dependsOnMethods="login") 
	public void sbi() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	
			//load the web page
			d.get("https://retail.onlinesbi.com/retail/login.htm");
	       Actions a = new Actions(d);
	    
	     // a.contextClick();
	      a.contextClick(d.findElement(By.linkText("CONTINUE TO LOGIN"))).perform();
	        Thread.sleep(2000);
	}
}
