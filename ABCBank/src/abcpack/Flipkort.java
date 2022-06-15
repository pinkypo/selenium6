package abcpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkort {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	    d.get("https://www.flipkart.com/");
	    //d.findElement(By.name("q")).sendKeys("Books");
	   
	}

}

