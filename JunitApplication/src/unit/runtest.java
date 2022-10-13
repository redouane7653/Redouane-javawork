package unit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class runtest {
	@Test // check if FindBig() method returns right results
	public void runFindBig() {
		//assertequals chek if first argument is equal is equal to 2nd argument
		assertEquals(500, Calculator.findBig(500, 200));
		
	}
	
	@Test // check if FindBig() method returns right results
	public void runFindSmall() {
		//assertequals check if first argument is equal to 2nd argument
		assertEquals(10, Calculator.findSmall(10, 20));
	}
	@Test
	public void runFindBiggets() {
		assertEquals(20, Calculator.findBiggest(10, 20, 15));
		
		
		
		
		
		
	}
	@Test //
	public void runFindMax() {
		int[] myArray= {100, 20, 30, 1500, 400};
		assertEquals(340, Calculator.findMax(myArray));
	}
	
}
