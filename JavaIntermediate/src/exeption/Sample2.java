package exeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample2 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 2; // Code Error
			int z = x / y; // logical error
			int[] nums = new int[5];
			nums[4] = 200;

			Connection con = DriverManager.getConnection("", "", "");// Try and catch handling
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("We can't divide anumber by zero");


		}finally {


			System.out.println("I will get executed always or (thank you for chosing us!)");

	}
}
}