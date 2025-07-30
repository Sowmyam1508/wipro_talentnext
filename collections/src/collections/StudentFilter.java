package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {
	int rollNo;
	String name;
	int mark;

	
	public Student(int rollNo, String name, int mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
}

public class StudentFilter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details for Student " + (i + 1));

			System.out.print("Roll No: ");
			int rollNo = scanner.nextInt();
			scanner.nextLine(); // consume newline

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Mark: ");
			int mark = scanner.nextInt();

			students.add(new Student(rollNo, name, mark));
		}

		
		List<Student> passedStudents = students.stream().filter(s -> s.mark >= 50).collect(Collectors.toList());

		System.out.println("\nNumber of students who cleared the test: " + passedStudents.size());

		scanner.close();
	}
}
