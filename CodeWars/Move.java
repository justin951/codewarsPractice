package CodeWars;

public class Move {
  public static int move(int position, int roll) {
    return position + 2 * roll;
  }

  public static void main(String[] args) {
    Integer a = 3;
    Integer b = 6;
    System.out.println(move(a, b));
  }
}
