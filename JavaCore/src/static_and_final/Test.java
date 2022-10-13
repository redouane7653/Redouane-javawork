package static_and_final;

public class Test {

	public static void main(String[] args) {
Mysample obj1=new Mysample();// ++101
obj1.x=10;
System.out.println(obj1.x);
obj1.x++;
System.out.println(Mysample.staticX++);//102
System.out.println(Mysample.staticX++);//103

Mysample obj2=new Mysample();//++104
obj2.x=20;
System.out.println(obj2.x);
obj2.x++;
System.out.println(obj2.x);
System.out.println(Mysample.staticX++);//105

Mysample obj3=new Mysample();//++//106
System.out.println(Mysample.staticX++);

	}

}
