package iostream;
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();
        try (
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile)
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File is copied.");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }

        scanner.close();
    }
}

