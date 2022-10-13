package list_of_objects_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_person {

	public static void main(String[] args) {
		Person p1=new Person("Jim", 26,"Engineer");
		//System.out.println(p1.toString());
		Person p2=new Person("Sam",35,"Artist");
		//System.out.println(p1.toString());
		Person p3=new Person("Irina", 22,"Doctor");
		//System.out.println(p1.toString());
		Person p4=new Person("Milena",28,"Project manager");
		//System.out.println(p1.toString());		
		ArrayList<Person> list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(new Person("Kim", 27, "Line manager"));
	
	Person p=new Person();
	p.getProduct(list);
		
	
		}
	}



