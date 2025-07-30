package collections;

import java.util.*;

public class CountryCapitalMap {
	private HashMap<String, String> M1;

	public CountryCapitalMap() {
		M1 = new HashMap<>();
	}

	public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
		M1.put(countryName, capital);
		return M1;
	}

	public String getCapital(String countryName) {
		return M1.get(countryName);
	}

	public String getCountry(String capitalName) {
		for (Map.Entry<String, String> entry : M1.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(capitalName)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public HashMap<String, String> reverseMap() {
		HashMap<String, String> M2 = new HashMap<>();
		for (Map.Entry<String, String> entry : M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}

	public ArrayList<String> getAllCountries() {
		return new ArrayList<>(M1.keySet());
	}

	public static void main(String[] args) {
		CountryCapitalMap map = new CountryCapitalMap();
		map.saveCountryCapital("India", "Delhi");
		map.saveCountryCapital("Japan", "Tokyo");
		System.out.println("Capital of India: " + map.getCapital("India"));
		System.out.println("Country for capital 'Tokyo': " + map.getCountry("Tokyo"));
		HashMap<String, String> M2 = map.reverseMap();
		System.out.println("\nReversed Map (Capital → Country):");
		for (Map.Entry<String, String> entry : M2.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
		ArrayList<String> countries = map.getAllCountries();
		System.out.println("\nList of countries:");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
