package Methods;

public class tv_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tele=new Television();
		tele.brand="Samsung";
		tele.price=1200;
		tele.screen_size=55;
		tele.turn_On();
		// Method one to get return values from a java method
		int x=tele.switchToAChannel();
		System.out.println(x);
		System.out.println(tele.switchToAChannel());
		// Method two to get return values from java method
		double discount=tele.getDiscount();
		System.out.println(discount);
		
		double discountOnBF=tele.discountOnBlackFriday(30);
		System.out.println(discountOnBF);
		
		double discountAtTheEnd=tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);
		
		
	}

    }


