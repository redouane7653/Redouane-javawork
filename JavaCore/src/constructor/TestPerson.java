package constructor;

public class TestPerson {

	public static void main(String[] args) {
			Person p1=new Person();
			p1.name="Upasana";
			p1.age=32;
			p1.adress="Bengaluru";
			p1.phone=12345;
			
			
			Person p2=new Person("Hilda", 25,"UK", 345678);
			Person p3=new Person("Arifi", 22,"USA", 44444);
			Person p4=new Person("Kev", 23);
			p4.adress="London";
			p4.phone=345678;

	}

}
