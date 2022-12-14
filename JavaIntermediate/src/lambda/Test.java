package lambda;

public class Test {

	public static void main(String[] args) {

		
		// Person p=new Person();
		// p.greet();
		//Greeting gr=new Greeting();// not allowed
		//Greeting gr=new Person(); dependency on class person 
		
		
		// Anonymous class 
		Greeting gr=new Greeting() {
			
			public void greet()
			{
				System.out.println("Hello world");
				
			}
			//public void welcome() {
				
				//System.out.println("Welcome");
			//}
				
			};
		gr.greet();
		//gr.welcome();
		
		
		// lambda expression 
		// leftside -> rightside
		// arguments -> body
		// () -> {printing/calculation}
		//Lambda without any arguments and no return type
		Greeting gr1=()->{System.out.println("Hello world");};
		gr1.greet();
			
		
		// Lambda with args and no return type
		
		GreetingWithName grName=(x)->{
			System.out.println("Hello "+x);};
			grName.greet("Franco");
		
		
	// Lambda with args and return type
	GreetingWithReturn grReturn=(x)->{return "Hello "+x ;};
	System.out.println(grReturn.greet("Hasan"));
}
}
