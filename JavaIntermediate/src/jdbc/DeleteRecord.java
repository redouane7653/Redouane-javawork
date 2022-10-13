package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Conected succesfully");
			
			String query="delete from customer where id=105;"; //query to be executed against db
			Statement stmt=con.createStatement();// to create SQL Statement
			stmt.executeUpdate(query);
			System.out.println("One record deleted succesfully");
			
			
			
			
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("Something went wrong");

			}

		}


}
