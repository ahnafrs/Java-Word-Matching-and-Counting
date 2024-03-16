
package qtectask;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Qtectask {
    public static void main(String[] args) {
        // Create a TreeMap to store word counts
        Map<String, Integer> wordCountMap = new TreeMap<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a line of text
        System.out.println("Enter line of text:");

        // Continue reading lines of text until an empty line is entered
        while (true) {
            // Read the input line
            String line = scanner.nextLine();

            // If the input line is empty, exit the loop
            if (line.isEmpty()) {
                break;
            }

            // Split the input line into words using whitespace and common punctuation marks as delimiters
            String[] words = line.split("[\\s.,;!?]+");

            // Count the occurrences of each word and update the wordCountMap
            for (String word : words) {
                // Convert the word to lowercase for case-insensitive counting
                String cleanedWord = word.toLowerCase();
                // Increment the count of the word in the wordCountMap
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        // Print the word count for each word in the wordCountMap
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
```

Now the instructions for running and testing the Java program are included as comments within the code itself.