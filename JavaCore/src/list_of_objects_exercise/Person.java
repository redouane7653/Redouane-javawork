package list_of_objects_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	String jobTitle;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
		public void getProduct(ArrayList<Person>list)
		{
				
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String findName=scn.next();
		for(int i=0;i<list.size();i++)
		{
		if(list.get(i).getName().equals(findName))
		{
			System.out.println(list.get(i));
		}
	}
			
	
	}
	public Person(String name, int age, String jobTitle) {
		super();
		
		this.name = name;
		
		this.age = age;
		
		this.jobTitle = jobTitle;
		
	
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + " \n age=" + age + " \n  jobTitle=" + jobTitle + "] \n";
	}
	
	
	

}
