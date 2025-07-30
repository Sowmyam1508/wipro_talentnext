package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OddEvenConsumer {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		numbers.add(11);
		numbers.add(14);
		numbers.add(17);
		numbers.add(20);
		numbers.add(23);
		numbers.add(26);
		numbers.add(29);
		Consumer<Integer> printOddEven = num -> {
			String type = (num % 2 == 0) ? "even" : "odd";
			System.out.println(num + " " + type);
		};
		numbers.forEach(printOddEven);
	}
}
