package collections_miniproject1;

import java.util.*;

class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String address;

	public Employee(String firstName, String lastName, String mobile, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public int compareTo(Employee other) {
		return this.firstName.compareToIgnoreCase(other.firstName);
	}

	public void display() {
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", firstName, lastName, mobile, email, address);
	}
}

public class EmployeeRegister {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the Number of Employees: ");
		int count = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= count; i++) {
			System.out.println("Enter Employee " + i + " Details:");

			System.out.print("Enter the Firstname: ");
			String firstName = scanner.nextLine();

			System.out.print("Enter the Lastname: ");
			String lastName = scanner.nextLine();

			System.out.print("Enter the Mobile: ");
			String mobile = scanner.nextLine();

			System.out.print("Enter the Email: ");
			String email = scanner.nextLine();

			System.out.print("Enter the Address: ");
			String address = scanner.nextLine();

			employees.add(new Employee(firstName, lastName, mobile, email, address));
		}

		Collections.sort(employees);

		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");

		for (Employee emp : employees) {
			emp.display();
		}

		scanner.close();
	}
}
