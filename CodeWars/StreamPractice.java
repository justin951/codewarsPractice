import java.util.Arrays;
import java.util.stream.Collectors;

// aka spinWords

public class StreamPractice {
    public static void main(String[] args) {
        String input = "this is my example string";

        String output = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }

}
