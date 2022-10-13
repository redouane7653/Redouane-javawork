package constructor;

public class Person {
	
	String name;
	int age;
	String adress;
	int phone;




// public Person(){}
	public Person() {
		System.out.println("Person class instantiated");
	

	}
	public Person(String n, int a, String add, int p) {
	name=n;
	if(a<=0)
	{
		System.out.println("age can not be less than 0");
	}
	else {
		age=a;
		
	}
	adress=add;
	phone=p;
}
public Person(String n, int a) {
	name=n;
	if(a<=0)
	{
		System.out.println("age cannot be less than 0");
	}
	else {
		 age=a;	
	}
}
}


