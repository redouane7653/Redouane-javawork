package userdefinedException;

public class ElectionDay {

	public static void main(String[] args) {
		Election obj = new Election();
		try {
			obj.CheckEligibility(12);
		} catch (InvalidAgeException e) {

			System.out.println(e.getMessage());
		}
		
		CheckCC obj1=new CheckCC();
		try {
			obj1.check("12345678901234567890");
		} catch (CreditCardException e) {
			System.out.println(e.getMessage());
		}

	}

}
