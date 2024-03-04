package CodeWars;

public class TwiceAsOld {
  public static int calculateTwiceAsOld(int dadYears, int sonYears) {
    return dadYears - (sonYears * 2);
  }

  public static void main(String[] args) {
    System.out.println(calculateTwiceAsOld(32, 10));
  }
}
