package abcpack;

import static org.testng.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReceivePayement1 {
	WebDriver d;
	Connection con;
	private CharSequence amount2;
	@Test
	public void testLogin() throws Exception
	{
		// Load web page
		d.get("https://demo.cyclos.org/ui/login");
		// Click on Login
		
		// Enter user name
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		// Enter password
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		// Click on submit
		d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Pay user")).click();
		//Read data from db
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create the connection using thegetConnection method
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyclos","root","kilaru@92");
         //Create a Statement class to execute the SQL statement 
             Statement st = con.createStatement();
             //interface
				ResultSet rs = st.executeQuery("Select * from paydetails;");
				while (rs.next())
				{
					String amount2 = rs.getString("Amount2");
					// click on payemebt system
	   
		d.findElement(By.linkText("Payment to system")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='0,00']")).sendKeys(amount2);
		//d.findElement(By.xpath("//input[@id='id_1']")).sendKeys(amount2);
		Thread.sleep(2000);
		String amt=d.findElement(By.xpath("//input[@placeholder='0,00']")).getAttribute("value");
		//SString amt=d.findElement(By.xpath("//input[@id='id_1']")).getAttribute("value");
		d.findElement(By.xpath("//div[contains(text(),'Pay now')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		//d.findElement(By.xpath("//button[contains(.,'Confirm')]")).click();
		Thread.sleep(2000);
		
		//Thread.sleep(3000);
		//Blank amount
				if(amt.equals(""))
				{
					assertTrue(d.findElement(By.cssSelector(".invalid-feedback")).getText().equals("This field is required"));
					//assertTrue(d.findElement(By.cssSelector("//input[@id='id_5']")).getText().equals("This field is required"));
				}
				
				else if(isElementPresent(d,By.xpath("//field-errors/div")))
				{
					assertTrue(d.findElement(By.xpath("//field-errors/div")).getText().equals("Amount must be a positive number."));
				}
			
			// Valid amount
			else if(!(amt.equals("")))
			{
				// Click on confirm
				//d.findElement(By.xpath("//button[contains(.,'Next')]")).click();
				
				d.findElement(By.xpath("//button[contains(.,'Confirm')]")).click();
			}
			Thread.sleep(2000);
				}
		// click on dashBoard
		d.findElement(By.partialLinkText("Dashboard")).click();
		}
				private boolean isElementPresent(WebDriver d2, By cssSelector) {
					try
					{
						d2.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
						d2.findElement(cssSelector);
						return true;
					}
					catch(Exception e)
					{
						System.out.println(e);
						return false;
					}

					}

					


				@BeforeMethod
				public void setUp1()
				{
					System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
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

	








