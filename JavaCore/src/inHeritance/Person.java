package inHeritance;

public abstract class Person {
	String name;
	int age;
	public Person() {}

	public Person(String name, int age) 
	{
	this.name=name;
	this.age=age;
	System.out.println("Person constructor");
		
	}
	
	public abstract void doSomething();//no body
	//normal instance method with body
	public void talk()
    {
        System.out.println("People do something to make their living");
    }

}
