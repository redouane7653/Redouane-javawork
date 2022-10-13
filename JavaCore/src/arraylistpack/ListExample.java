package arraylistpack;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public List<String> meat = new ArrayList<>();

	public static void main(String[] args) {
		List<String> sandwiches = new ArrayList<>();
			
		sandwiches.add("bread sandwich");
		sandwiches.add("pop tart");
		sandwiches.add("hot dog");

		System.out.println(sandwiches);
		System.out.println(sandwiches.get(0));
		sandwiches.set(0, "ice cream taco");
		System.out.println(sandwiches);
		sandwiches.remove(0);
		System.out.println(sandwiches);
		sandwiches.size();
		sandwiches.clear();
		System.out.println(sandwiches);
		for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
			for (String i1 : sandwiches) 
				System.out.println(i1);
			}
		}

}
