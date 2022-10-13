package switch_function;

public class TheSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String basic_color = "Blue";
		//Scanner scn=new Scanner(System.in);
		//String basic_color=scn.next();
		 
		switch (basic_color) {
		case "blue":
			System.out.println("You got blue");
			break;
		case "red":
			System.out.println("You got red");
			break;
		case "green":
			System.out.println("You got green");
			break;
		default:
			System.out.println("Not a valid color");
		
		}
		System.out.println("End of the program");
	}	

}
