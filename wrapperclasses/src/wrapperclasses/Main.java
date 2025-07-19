package wrapperclasses;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    // Clone method
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}




	public class Main {
	    public static void main(String[] args) {
	        try {
	            // Create original employee
	            Employee emp1 = new Employee(101, "Alice", 50000.0);

	            // Clone the employee
	            Employee emp2 = emp1.clone();

	            // Modify original employee details
	            emp1.name = "Bob";
	            emp1.salary = 60000.0;

	            // Print both employees
	            System.out.println("Original Employee:");
	            emp1.display();

	            System.out.println("Cloned Employee:");
	            emp2.display();

	        } catch (CloneNotSupportedException e) {
	            System.out.println("Cloning not supported.");
	        }
	    }
	}

