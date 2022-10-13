package inheritance_Execise_Shapes;

public class Triangle extends Shape{
	float base;
	float height;
	
	public Triangle(String colour, float base, float height) {
		super(colour);
		this.base= base;
		this.height= height;
	}
	public void calculateArea() {
		
System.out.println("Area of "+colour+"triangle"+(height*base)/2 );
	}

}
