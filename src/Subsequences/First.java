package Subsequences;

import java.util.HashMap;
import java.util.Map;

public class First {
    public static int firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        char[] chars = str.toCharArray();

        // First, populate the frequency map
        for (char ch : chars) {
            characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Then, find the first character with a frequency of 1
        for (int i = 0; i < chars.length; i++) {
            if (characterFrequencyMap.get(chars[i]) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("racecar"));  // Should print 1 ('a')
    }
}
