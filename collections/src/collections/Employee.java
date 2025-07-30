package collections;

public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;

	public Employee(int empId, String empName, String email, String gender, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public float getSalary() {
		return salary;
	}

	public void getEmployeeDetails() {
		System.out.println("ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Email: " + email);
		System.out.println("Gender: " + gender);
		System.out.println("Salary: " + salary);
	}
}
