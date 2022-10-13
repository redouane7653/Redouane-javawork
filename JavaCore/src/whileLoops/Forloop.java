package whileLoops;

public class Forloop {

	public static void main(String[] args) {
		int x = 1;
		do {
			if (x % 2 == 0)
				System.out.println("hello ---" + x + "times");
			x++;
		} while (x <= 10);
		System.out.println("End of program");

	}

}
