package abcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class First {
	public static void main(String[] args) throws Exception {
		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create the connection using thegetConnection method
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","kilaru@92");
        //Create a Statement class to execute the SQL statement 
        Statement stmt=conn.createStatement();
        //Execute the SQL statement and get the results in a Resultset 
        ResultSet rs=stmt.executeQuery("select * from Students;" );
        // Iterate through the ResultSet, displaying two values 
        // for each row using the getString method 
        while(rs.next())
         {
          
            String name=rs.getString("Name");
            String section=rs.getString("section");
            
            System.out.println(name+""+section);
         }
     
        {
        	 stmt.close();
  	         conn.close();
        }
                            
       }
  }


