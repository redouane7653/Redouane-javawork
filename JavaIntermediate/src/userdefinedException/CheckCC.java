package userdefinedException;

public class CheckCC {

		public void check(String ccNo) throws CreditCardException
		{
			if (ccNo.length()>16)
				throw new CreditCardException("Invalid credit card");
			else
				System.out.println("Payment Completed");
		}
	}


