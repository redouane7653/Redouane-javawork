package encapsulation;

public class Encapsulation {
	private String brand ;
	private int RAM;
	private String colour;
	public String getBrand() {
		return brand;
		
		{
		
		 switch (brand) {
	        case "Samsung":
	            this.brand = brand;
	            break;
	        case "Apple":
	            this.brand = brand;
	            break;
	        case "Sony":
	            this.brand = brand;
	            break;
	        default:
	            System.out.println("Not a valid brand");{
	            	}
	            
	            if(x instanceof Milk)
	                System.out.println("swirling milk");
	            else if(x instanceof Tea)
	                System.out.println("swirling Tea");
	            else if(x instanceof Coffee)
	                System.out.println("swirling coffee");
	            else
	                System.out.println("swirling some liquid");
			
		
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
