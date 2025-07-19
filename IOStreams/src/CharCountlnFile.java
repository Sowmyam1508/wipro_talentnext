import java.io.*;
import java.util.Scanner;

public class CharCountlnFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the file name");
		String fileName = scanner.nextLine();

		System.out.println("Enter the character to be counted");
		String input = scanner.nextLine();

		if (input.length() != 1) {
			System.out.println("Please enter exactly one character.");
			scanner.close();
			return;
		}

		char targetChar = Character.toLowerCase(input.charAt(0)); // Convert to lowercase

		int count = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			int c;
			while ((c = reader.read()) != -1) {
				if (Character.toLowerCase((char) c) == targetChar) {
					count++;
				}
			}
			System.out.printf("File '%s' has %d instances of letter '%s'.\n", fileName, count, input);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}

		scanner.close();
	}
}
