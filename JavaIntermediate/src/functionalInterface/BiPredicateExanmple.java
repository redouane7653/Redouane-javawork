package functionalInterface;

import java.util.function.BiPredicate;
public class BiPredicateExanmple {
    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
            // can take 2 values and return length of strings in integers and checking if a condition is met (True or False)
        };
        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true
        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }
}
