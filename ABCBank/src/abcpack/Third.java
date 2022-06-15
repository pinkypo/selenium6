package abcpack;

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

public class Third {
	WebDriver d;
	Connection con;
	@Test
	public void testLogin() throws Exception
	
	{
		// Load web page
		d.get("https://mypage.rediff.com/login/dologin");
		// Click on Login
		
		
		
		// Read data from DB 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create the connection using thegetConnection method
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyclos","root","kilaru@92");
         //Create a Statement class to execute the SQL statement 
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("Select * from Information;");
				while (rs.next())
				{
					String amou = rs.getString("");
					String pname = rs.getString("");
             
             //interface
          // Enter user name
     		d.findElement(By.xpath("//input[@id='txtlogin']")).sendKeys("Selenium");
     		// Enter password
     		d.findElement(By.xpath("//input[@id='pass_box']")).sendKeys("Selenium");
     		// Click on submit
     		d.findElement(By.xpath("//input[@id='pass_box']")).click();
     		Thread.sleep(2000);
     		d.findElement(By.xpath("//input[@value='Login']")).click();
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


