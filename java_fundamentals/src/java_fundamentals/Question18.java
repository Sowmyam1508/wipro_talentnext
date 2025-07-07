package java_fundamentals;

import java.util.*;

public class Question18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		while (true) {
			System.out.print("Enter number of rows: ");
			String input = sc.nextLine().trim();

			if (input.matches("\\d+")) {
				rows = Integer.parseInt(input);
				break;
			} else {
				System.out.println("Please enter a valid integer number.");
			}
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
