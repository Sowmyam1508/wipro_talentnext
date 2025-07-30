package collections;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeSet {
	public static void main(String[] args) {
		HashSet<String> employeeNames = new HashSet<>();
		employeeNames.add("Alice");
		employeeNames.add("Bob");
		employeeNames.add("Charlie");
		employeeNames.add("David");
		employeeNames.add("Eve");
		Iterator<String> iterator = employeeNames.iterator();

		System.out.println("Employee names in the HashSet:");
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}
