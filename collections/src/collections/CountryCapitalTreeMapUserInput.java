package collections;
import java.util.*;

public class CountryCapitalTreeMapUserInput {
    private TreeMap<String, String> M1;

    public CountryCapitalTreeMapUserInput() {
        M1 = new TreeMap<>();
    }
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
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
    public TreeMap<String, String> reverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }
    public static void main(String[] args) {
        CountryCapitalTreeMapUserInput map = new CountryCapitalTreeMapUserInput();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many countries do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter country " + i + ": ");
            String country = scanner.nextLine();

            System.out.print("Enter capital of " + country + ": ");
            String capital = scanner.nextLine();

            map.saveCountryCapital(country, capital);
        }
        System.out.print("\nEnter a country to get its capital: ");
        String searchCountry = scanner.nextLine();
        String capital = map.getCapital(searchCountry);
        if (capital != null) {
            System.out.println("Capital of " + searchCountry + " is: " + capital);
        } else {
            System.out.println("Country not found.");
        }
        System.out.print("\nEnter a capital to find its country: ");
        String searchCapital = scanner.nextLine();
        String country = map.getCountry(searchCapital);
        if (country != null) {
            System.out.println("Country with capital " + searchCapital + " is: " + country);
        } else {
            System.out.println("Capital not found.");
        }
        System.out.println("\nReversed Map (Capital → Country):");
        TreeMap<String, String> reversed = map.reverseMap();
        for (Map.Entry<String, String> entry : reversed.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("\nList of all countries:");
        ArrayList<String> countries = map.getAllCountries();
        for (String c : countries) {
            System.out.println(c);
        }

        scanner.close();
    }
}