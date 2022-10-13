package calculator;

import java.util.Scanner;

public class calculator_caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator=new Calculator();
		
Scanner scn= new Scanner(System.in);
System.out.println("Enter first number");
int a=scn.nextInt();

System.out.println("Enter second Number");
int b=scn.nextInt();

System.out.println("Enter your choice");
System.out.println("1: Addition");
System.out.println("2: Difference");
System.out.println("3: Division");
System.out.println("4: Multiplication");

int ans=scn.nextInt();

switch(ans) {

case 1:
	System.out.println(calculator.add(a, b));
	break;

case 2:
	System.out.println(calculator.minus(a, b));
	break;
case 3:
	System.out.println(calculator.div(a, b));
	break;

case 4:
	System.out.println(calculator.multi(a, b));
	break;
	
default:
	System.out.println("Select a valid input");
	
}



	}

}
