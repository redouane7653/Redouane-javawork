package exeption;

public class Shopping {
	// handling the exception // take responsibility of fixing all the issues by
	// itself
	public void AddToCart() {
		try {
			String[] cart = new String[5];
			cart[5] = "Mobile";
		} catch (Exception e) {
		}

	}

	// Declaring the exception // i will pass the ownership to calling environment
	public void makePayment() throws Exception {
		int x = 10;
		int y = 0;
		int z = x / y;
	}

}
