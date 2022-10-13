package inHeritance;

public class Test {

	public static void main(String[] args) {
			//Person p=new 	Person();
		//Employee e=new Employee();
		
		Person p1=new Employee();
		Person p3=new Manager();
		
		Manager m=new Manager("Upasana",32,1001,"Training");
		System.out.println("End of the code");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.dept);

		m.doSomething();
	}
	
	
	

}
