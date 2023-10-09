package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connection1 {

	public static void main(String[] args) 
	{
		try {	//we need to call outside of java program so we try to know status of if file and connectivity problem throw out exception case
				Class.forName("com.mysql.jdbc.Driver");//register the Driver class
				
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","anitha@19!");//get the mysql connection through driver class and path with user name and password
				
				Statement sta=(Statement) con.createStatement();//before execute the mysql we need to catch the query by using one statement
				
			     ResultSet re=sta.executeQuery("Select * from std");//we are execute the mysql query and result to store in the ResultSet object
			
				while(re.next())//the table may contain n number of records , we need to print all records by using of looping statement
				{
					System.out.println(re.getString(1)+"   	 "+re.getString(2)+" 		"+ re.getString(3)+"		"+re.getString(4)+"   	 "+re.getString(5)+" 		"+ re.getString(6)+"		"+re.getString(7));//calling the table values the column details(calling the columns)
				}
		}
		catch (Exception e) 
		{
			System.out.println(e);//if any external problem is raised the catch (exception) going to handle and convey to the developer
		}

	}
		
}