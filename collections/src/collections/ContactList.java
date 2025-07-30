package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactList {
	public static void main(String[] args) {
		HashMap<String, Integer> contacts = new HashMap<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many contacts do you want to add? ");
		int count = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter name for contact " + i + ": ");
			String name = scanner.nextLine();

			System.out.print("Enter phone number for " + name + ": ");
			int phone = scanner.nextInt();
			scanner.nextLine();
			contacts.put(name, phone);
		}
		System.out.print("\nEnter a name to check if it exists: ");
		String searchName = scanner.nextLine();
		if (contacts.containsKey(searchName)) {
			System.out.println("Contact '" + searchName + "' exists.");
		} else {
			System.out.println("Contact '" + searchName + "' does NOT exist.");
		}
		System.out.print("\nEnter a phone number to check if it exists: ");
		int searchPhone = scanner.nextInt();
		if (contacts.containsValue(searchPhone)) {
			System.out.println("Phone number '" + searchPhone + "' exists in contact list.");
		} else {
			System.out.println("Phone number '" + searchPhone + "' does NOT exist.");
		}
		System.out.println("\nIterating through the contact list:");
		Set<Map.Entry<String, Integer>> entrySet = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Name: " + entry.getKey() + " | Phone: " + entry.getValue());
		}

		scanner.close();
	}
}
