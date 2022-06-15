package abcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Second {
	public static void main(String[] args) throws Exception {
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// CREATE Connection
		//Create the connection using thegetConnection method
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cyclos","root","kilaru@92");
		
	        //Create a Statement class to execute the SQL statement 
	        Statement stmt=conn.createStatement();
	        //Execute the SQL statement and get the results in a Resultset 
	        ResultSet rs=stmt.executeQuery("select * from Employee;" );
	        // Iterate through the ResultSet, displaying two values 
	        // for each row using the getString method 
	        while(rs.next())
	         {
	           int roll=rs.getInt("Roll No");
	           
	            String Emp_Name=rs.getString("Emp_Name");
	            String Emp_Salary=rs.getString("Emp_Salary");
	            System.out.println(Emp_Name+""+Emp_Salary);
	         }
	     
	        {
	        	 stmt.close();
	  	         conn.close();
	        }
	                            
	       }
	  }

	

