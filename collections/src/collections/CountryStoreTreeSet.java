package collections;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class CountryStoreTreeSet {
	private TreeSet<String> countries;

	public CountryStoreTreeSet() {
		countries = new TreeSet<>();
	}

	public TreeSet<String> saveCountryNames(String countryName) {
		countries.add(countryName);
		return countries;
	}

	public String getCountry(String countryName) {
		for (String country : countries) {
			if (country.equalsIgnoreCase(countryName)) {
				return country;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountryStoreTreeSet store = new CountryStoreTreeSet();

		System.out.print("Enter number of countries to add: ");
		int num = scanner.nextInt();
		scanner.nextLine(); // consume newline

		for (int i = 1; i <= num; i++) {
			System.out.print("Enter country " + i + ": ");
			String country = scanner.nextLine();
			store.saveCountryNames(country);
		}

		System.out.println("\nAll countries (sorted):");
		Iterator<String> iterator = store.countries.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.print("\nEnter country to search: ");
		String searchCountry = scanner.nextLine();
		String result = store.getCountry(searchCountry);
		if (result != null) {
			System.out.println("Country found: " + result);
		} else {
			System.out.println("Country not found.");
		}

		scanner.close();
	}
}