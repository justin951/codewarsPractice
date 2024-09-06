import java.util.*;

public class anotherCountWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Integer> result = new HashMap<>();
            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                result.put(word, result.getOrDefault(word, 0) + 1);
            }
            System.out.println(result);
        }
    }
}
