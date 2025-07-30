package collections;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Alice", "alice@example.com", "Female", 50000.0f);
		Employee e2 = new Employee(102, "Bob", "bob@example.com", "Male", 60000.0f);
		Employee e3 = new Employee(103, "Charlie", "charlie@example.com", "Male", 70000.0f);

		EmployeeDB db = new EmployeeDB();
		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);

		System.out.println("All Employees:");
		db.displayAll();
		System.out.println(db.showPaySlip(102));
		System.out.println(db.showPaySlip(999));
		boolean deleted = db.deleteEmployee(102);
		System.out.println("Deleted employee 102: " + deleted);
		System.out.println("\nEmployees after deletion:");
		db.displayAll();
	}
}
