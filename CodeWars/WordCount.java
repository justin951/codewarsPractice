import java.util.*;
import java.util.stream.Collectors;
// import java.util.HashMap;
// import java.util.Map;

public class WordCount {

  public static Map<String, Integer> returnWordMap(String words) {
    String[] arr = words.split(" ");

    // for loop
    Map<String, Integer> wordCounts = new HashMap<>();

    for (String word : arr) {
      if (!wordCounts.containsKey(word)) {
        wordCounts.put(word, 1);
      } else {
        wordCounts.put(word, wordCounts.get(word) + 1);
      }
    }

    // stream
    // Map<String, Integer> wordCountsStream = Arrays.stream(arr)
    // .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

    return wordCounts;
    // return wordCountsStream;
  }

  public static void main(String[] args) {
    System.out.println(returnWordMap("this is my string string this"));
  }
}
