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
    String[] vowels = { "a", "e", "i", "o", "u" };

    for (String sorter : vowels) {
      if (input.contains(sorter)) {
        input = input.replace(sorter, "");
      }
    }

    return input;
  }

  public static Integer vowelCount(String input) {
    int count = 0;
    String vowels = "aeiou";

    for (char c : input.toCharArray()) {
      if (vowels.indexOf(c) != -1) {
        count += 1;
      }
    }

    return count;
  }
}
