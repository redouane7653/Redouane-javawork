package exeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 2; // Code Error
			int z = x / y; // logical error
			int[] nums = new int[5];
			nums[4] = 200;

			Connection con = DriverManager.getConnection("", "", "");// Try and catch handling
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("We can't divide anumber by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("We can not place emelements out of an  array's boundry");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("could not connect to  database");

		} finally {

			System.out.println("I will get executed always or (thank you for chosing us!)");
		}
		// Connection con = DriverManager.getConnection("", "", "");// Try and catch
		// handling

	}

}