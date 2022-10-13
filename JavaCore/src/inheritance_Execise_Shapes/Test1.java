package inheritance_Execise_Shapes;

public class Test1 {

	public static void main(String[] args) {
		
		Shape Circle=new Circle("Red",5);
		Shape sqr=new Square("Blue", 10);
		Shape tri=new Triangle("Yellow",15, 39);
		Circle.calculateArea();
		sqr.calculateArea();
		tri.calculateArea();
	}

}
