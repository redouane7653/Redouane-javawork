package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {
	
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Conected succesfully");
			
			String query="insert into customer values(106,'Edith',9999,'ed@gmail.com');"; //query to be executed against db
			Statement stmt=con.createStatement();// to create SQL Statement
			stmt.executeUpdate(query);
			System.out.println("One record inserted succesfully");
			
			
			
			
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("Something went wrong");

			}

		}


}
