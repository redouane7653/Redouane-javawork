package Methods;

public class Television {
	String brand;
	int price;
	int screen_size;
	//method which takes nothing and returns nothing
	public void turn_On()
	{
		System.out.println("Shows display");
		
	}
	//method which takes nothing and returns something(integer)
	public int switchToAChannel()
	{
		return 1;
	}
	//method which takes nothing and returns something(double)
	public double getDiscount()
	{
		return(price*10/100);
	}
	
	// method which takes something(double) and returns something(double)
	public double discountOnBlackFriday(int dis)
	{
		System.out.println("");
		return(price*dis/100);
	}
	
	
		
	public	double discountWithCityBank(int dis, int cityDiscount)
	{
		System.out.println("");
		int totalDiscount=dis+cityDiscount;
		return (price*(dis+cityDiscount)/100);
		
        
	}
}
