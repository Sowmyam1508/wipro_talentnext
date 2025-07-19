//import java.io.*;
//	import java.util.Scanner;
//public class FileCopy {
//	
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Get input file name
//	        System.out.println("Enter the input file name");
//	        String inputFile = scanner.nextLine();
//
//	        // Get output file name
//	        System.out.println("Enter the output file name");
//	        String outputFile = scanner.nextLine();
//
//	        // Perform file copy
//	        try (
//	            FileReader reader = new FileReader(inputFile);
//	            FileWriter writer = new FileWriter(outputFile)
//	        ) {
//	            int character;
//	            while ((character = reader.read()) != -1) {
//	                writer.write(character);
//	            }
//
//	            System.out.println("File is copied.");
//	        } catch (FileNotFoundException e) {
//	            System.out.println("Input file not found: " + inputFile);
//	        } catch (IOException e) {
//	            System.out.println("Error during file copy: " + e.getMessage());
//	        }
//
//	        scanner.close();
//	    }
//	}
//

import java.io.*;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input file name
        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();

        // Get output file name
        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();

        // Perform file copy using character streams
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
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
