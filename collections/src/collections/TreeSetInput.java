package collections;

import java.util.*;

public class TreeSetInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<String> stringSet = new TreeSet<>();
		System.out.print("Enter the number of strings you want to add to TreeSet: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter string " + i + ": ");
			String input = scanner.nextLine();
			stringSet.add(input);
		}
		System.out.println("\nReversed TreeSet elements:");
		NavigableSet<String> reversedSet = stringSet.descendingSet();
		for (String item : reversedSet) {
			System.out.println(item);
		}
		System.out.println("\nIterating TreeSet using Iterator:");
		Iterator<String> iterator = stringSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.print("\nEnter a string to search in the TreeSet: ");
		String searchItem = scanner.nextLine();

		if (stringSet.contains(searchItem)) {
			System.out.println("Element '" + searchItem + "' exists in the TreeSet.");
		} else {
			System.out.println("Element '" + searchItem + "' does not exist in the TreeSet.");
		}

		scanner.close();
	}
}