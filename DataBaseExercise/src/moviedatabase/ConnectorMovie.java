package moviedatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorMovie {

	public static void main(String[] args) {

		try {
			String url="jdbc:mysql://localhost:3306/moviedb";
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Conected succesfully");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		System.out.println("Something went wrong");

			}
	}

}
