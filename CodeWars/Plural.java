package CodeWars;

public class Plural {
  public static boolean isPlural(float f) {
    return f == 1.0 ? false : true;
  }

  public static void main(String[] args) {
    System.out.println(isPlural((float)3.1));
  }
}
