package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a country name to check (key): ");
		String key = scanner.nextLine();
		if (map.containsKey(key)) {
			System.out.println("Key '" + key + "' exists in the map.");
		} else {
			System.out.println("Key '" + key + "' does NOT exist in the map.");
		}
		System.out.print("Enter a capital name to check (value): ");
		String value = scanner.nextLine();
		if (map.containsValue(value)) {
			System.out.println("Value '" + value + "' exists in the map.");
		} else {
			System.out.println("Value '" + value + "' does NOT exist in the map.");
		}
		System.out.println("\nIterating through the HashMap using Iterator:");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
		}

		scanner.close();
	}
}