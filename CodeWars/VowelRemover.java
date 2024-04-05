package CodeWars;

public class VowelRemover {
  public static String removeVowels(String inputString) {
    String result = "";
    String vowels = "aeiou";
    for (int i = 0; i < inputString.length(); i++) {
      if (!vowels.contains(String.valueOf(inputString.charAt(i)))) {
        result += inputString.charAt(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(removeVowels("this is a teest"));
    System.out.println(shortcut("this is also a test"));
  }

  public static String shortcut(String input) {
    // Array of vowels
    String[] vowels = { "a", "e", "i", "o", "u" };

    // Loop through each vowel in the array
    for (String sorter : vowels) {
      // Check if the input string contains the current vowel
      if (input.contains(sorter)) {
        // If it does, replace all occurrences of the vowel with an empty string
        input = input.replace(sorter, "");
      }
    }

    // Return the modified input string (without vowels)
    return input;
  }
}
