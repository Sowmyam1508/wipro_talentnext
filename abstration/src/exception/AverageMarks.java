package exception;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
            try {
                System.out.print("Enter the name of student " + i + ": ");
                String name = sc.nextLine();

                int[] marks = new int[3];
                for (int j = 0; j < 3; j++) {
                    while (true) {
                        try {
                            System.out.print("Enter marks for subject " + (j + 1) + " for " + name + ": ");
                            String input = sc.nextLine();
                            marks[j] = Integer.parseInt(input);

                            if (marks[j] < 0) {
                                throw new NegativeValueException("Marks cannot be negative.");
                            }
                            if (marks[j] > 100) {
                                throw new OutOfRangeException("Marks must be between 0 and 100.");
                            }
                            break; // Exit the inner loop if input is valid

                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter an integer value for marks.");
                        } catch (NegativeValueException e) {
                            System.out.println(e.getMessage());
                        } catch (OutOfRangeException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                double average = (marks[0] + marks[1] + marks[2]) / 3.0;
                System.out.println("Average marks for " + name + ": " + average);

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
	}
}