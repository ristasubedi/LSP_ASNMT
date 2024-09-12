package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    // Method to count words in a string
    public static Map<String, Integer> countingNums(String text) {
        // Split by non-letter characters (spaces, punctuation, digits)
        String[] words = text.split("[^a-zA-Z]+"); 
        Map<String, Integer> countingNums = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();

            // Ignore trivial words that has less than 3 letters
            if (word.length() > 3) {
                countingNums.put(word, countingNums.getOrDefault(word, 0) + 1);
            }
        }

        return countingNums;
    }

    // Main method
    public static void main(String[] args) {
        File fileName = new File("./src/org/howard/edu/lsp/assignment2/word.txt");
        BufferedReader buffer = null;
        StringBuilder text = new StringBuilder();

        try {
            buffer = new BufferedReader(new FileReader(fileName));
            String line;
            
            // Reading the file line by line
            while ((line = buffer.readLine()) != null) {
                text.append(line).append(" ");  // Append the lines to the text
            }
            
            // Process the entire text read from the file
            Map<String, Integer> result = countingNums(text.toString());

            // Print the results
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (buffer != null) {
                    buffer.close();  // Always close the BufferedReader
                }
            } catch (IOException e) {
                System.out.println("Error closing the BufferedReader: " + e.getMessage());
            }
        }
    }
}
