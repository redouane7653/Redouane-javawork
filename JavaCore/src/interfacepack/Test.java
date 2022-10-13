package interfacepack;

public class Test {

	public static void main(String[] args) {
		Person p=new Employee();
		p.doSomething();
		Artist a=new Employee();
		a.doArt();
		Player p1=new Employee();
		p1.doPlay();
		Doable d=new Employee();
		d.do1();
		
	}

}
