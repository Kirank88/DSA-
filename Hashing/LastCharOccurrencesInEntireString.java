package Hashing;
import java.util.HashMap;

public class LastCharOccurrencesInEntireString {
    public static void main(String[] args) {
        String str = "Reverse a given string ";
        findLastCharOccurrencesInEntireString(str);
    }

    public static void findLastCharOccurrencesInEntireString(String str) {
        // Remove leading and trailing spaces and split the string by spaces
        String[] words = str.trim().split("\\s+");

        // HashMap to store the occurrences of last characters
        HashMap<Character, Integer> lastCharCount = new HashMap<>();

        // Collect all last characters from the words
        for (String word : words) {
            if (word.length() > 0) {
                // Get the last character of the word
                char lastChar = word.charAt(word.length() - 1);

                // Now count how many times this character appears in the entire string
                int occurrences = countOccurrencesInString(str, lastChar);

                // Store the result in the map
                lastCharCount.put(lastChar, occurrences);
            }
        }

        // Print the results
        for (char ch : lastCharCount.keySet()) {
            System.out.println(ch + " : " + lastCharCount.get(ch));
        }
    }

    // Helper method to count occurrences of a character in the string
    public static int countOccurrencesInString(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

