package JavaJavaScript;

public class Practice {
  // 001 - join array
  public static String smash(String... words) {
    return String.join(" ", words);
  }

  public static void main(String[] args) {
        String[] wordsArray = {"Hello", "world", "in", "Java!"};
        System.out.println(smash(wordsArray));
    }
  }
