package collections;

import java.util.HashSet;

public class CountryStore {
	private HashSet<String> H1;

	public CountryStore() {
		H1 = new HashSet<>();
	}

	public HashSet<String> saveCountryNames(String countryName) {
		H1.add(countryName);
		return H1;
	}

	public String getCountry(String countryName) {
		for (String country : H1) {
			if (country.equalsIgnoreCase(countryName)) {
				return country;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		CountryStore store = new CountryStore();
		store.saveCountryNames("India");
		store.saveCountryNames("USA");
		store.saveCountryNames("Canada");
		System.out.println("Searching for 'India': " + store.getCountry("India"));
		System.out.println("Searching for 'France': " + store.getCountry("France"));
	}
}
