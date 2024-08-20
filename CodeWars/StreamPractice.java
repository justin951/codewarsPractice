import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        String input = "this is my example string";

        String output = Arrays.stream(input.split(" "))  // Split the input string by spaces
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                .collect(Collectors.joining(" "));  // Join the reversed words with spaces

        System.out.println(output);
    }

}

// StringBuilder sb = new StringBuilder();
// sb.append("Hello");
// sb.append(" ");
// sb.append("world");
// sb.append("!");
//
// String result = sb.toString(); // Convert StringBuilder to String
// System.out.println(result);    // Output: Hello world!
