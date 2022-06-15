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

public class PayUserMysql {
	WebDriver d;
	Connection con;
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
		
		// Read data from DB 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create the connection using thegetConnection method
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyclos","root","kilaru@92");
         //Create a Statement class to execute the SQL statement 
             Statement st = con.createStatement();
             //interface
				ResultSet rs = st.executeQuery("Select * from Information;");
				while (rs.next())
				{
					String amount = rs.getString("Amount");
					String pname = rs.getString("Payname");
			//d.findElement(By.linkText("Pay user")).click();
			d.findElement(By.linkText("Receive payment")).click();
		 	d.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("John M Keynes");
		 	Thread.sleep(1000);
		 	d.findElement(By.linkText(pname)).click();
			Thread.sleep(1000);
		     d.findElement(By.xpath("//input[@placeholder='0,00']")).sendKeys(amount);
		 	String amt=d.findElement(By.xpath("//input[@placeholder='0,00']")).getAttribute("value");
		 	Thread.sleep(2000);
			// Click on Next button
		     d.findElement(By.xpath("//button[contains(.,'Next')]")).click();
			Thread.sleep(2000);
		

			//Blank amount
			if(amt.equals(""))
			{
				assertTrue(d.findElement(By.cssSelector(".invalid-feedback")).getText().equals("This field is required"));
				
			}
			
			//invalid amount
			else if(isElementPresent(d,By.cssSelector(".invalid-feedback")))
			{
				assertTrue(d.findElement(By.cssSelector(".invalid-feedback")).getText().equals("Amount must be a positive number."));
				
			}

			// Valid amount
				else if(!(amt.equals("")))
				{
					// Click on confirm
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




