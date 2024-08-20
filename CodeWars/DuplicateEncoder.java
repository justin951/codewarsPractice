import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] wordArray = word.toCharArray();

        for (char character : wordArray) {
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);
        }

        StringBuilder resultBuilder = new StringBuilder();

        for (char character : wordArray) {
            if (charCount.get(character) > 1) {
                resultBuilder.append(')');
            } else {
                resultBuilder.append('(');
            }
        }

        return resultBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(encode("this is my word"));
    }
}
