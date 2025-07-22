package iostream;

import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take file names as input from user
        System.out.println("Enter the input file name:");
        String inputFile = scanner.nextLine();

        System.out.println("Enter the output file name:");
        String outputFile = scanner.nextLine();

        // TreeMap to store words alphabetically
        Map<String, Integer> wordCount = new TreeMap<>();

        // Read the input file and count words
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Optional: clean up punctuation if needed
                    word = word.replaceAll("[^a-zA-Z]", ""); // removes punctuation
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
            return;
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
            return;
        }

        // Write the result to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word count has been written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }

        scanner.close();
    }
}