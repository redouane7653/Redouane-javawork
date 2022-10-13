package inHeritance;

public class Employee extends Person{
	int empId;
	public Employee() {}
	public Employee(String name, int age, int empId)
	{
		//super() calls the constructor of super class
		// public Person(){}
		super(name, age);
		this.empId=empId;
		System.out.println("Employee constructor");

}
	public void doSomething()
    {
        System.out.println("Employees work for society");
    }
}