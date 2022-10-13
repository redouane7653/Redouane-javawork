package inheritance_Execise_Shapes;

public class Square extends Shape{
	float side;
	public Square(String colour, float side) {
		super(colour);
		this.side = side;
		
		
		
	}
public void calculateArea() {
	
	System.out.println("Area of square "+side*side);
}

}
