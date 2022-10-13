package inheritance_Execise_Shapes;

public class Circle extends Shape {
	float  Radius;
	
	public Circle(String colour, float radius){
	super(colour);
	this.Radius = radius;
	}
	
		public void calculateArea() {
			System.out.println("Area of "+colour+" circle "+ 3.14*Radius*Radius);			
	}
			
}
	

