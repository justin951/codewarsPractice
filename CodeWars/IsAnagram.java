import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        char[] arr1 = test.toLowerCase().toCharArray();
        char[] arr2 = original.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("test", "myword"));
        System.out.println(areAnagrams("test", "myword"));
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for each string
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count characters for the first string
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Subtract the count for the second string
        for (char c : str2.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) - 1);
        }

        // Check if all counts are zero
        for (int count : frequencyMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
