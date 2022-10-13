
package temp;

import java.util.Scanner;

// import java.lang.*;

public class Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);//accept the input 
		System.out.print("Please enter your first name");
		String name=scn.next();
		System.out.print("Please enter your last name");
		String name1 =scn.next();
		System.out.println("Hello," + " " + name + " "+ name1 +"!");
	}
}
