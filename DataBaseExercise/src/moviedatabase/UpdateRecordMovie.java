package moviedatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecordMovie {

	public static void main(String[] args) {

		try {
			String url="jdbc:mysql://localhost:3306/moviedb";
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Conected succesfully");
			
			String query="update movies set Imbd=10 where Title='No time to die';"; //query to be executed against moviedb
			Statement stmt=con.createStatement();// to create SQL Statement
			stmt.executeUpdate(query);
			System.out.println(" record updated succesfully");
			
			
			
			
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("Something went wrong");

			}

		}

	}


