package collections;

import java.util.Scanner;

public class MyClassWithLambda {
	@FunctionalInterface
	interface WordCount {
		int count(String str);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();
		WordCount wc = (str) -> {
			if (str == null || str.trim().isEmpty()) {
				return 0;
			}
			return str.trim().split("\\s+").length;
		};
		int result = wc.count(input);
		System.out.println("Number of words: " + result);

		scanner.close();
	}
}