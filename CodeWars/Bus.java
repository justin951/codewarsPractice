package CodeWars;

public class Bus {
  public static int enough(int cap, int on, int wait) {
    return on + wait < cap ? 0 : (on + wait) - cap;
  }

  public static void main(String[] args) {
    System.out.println(enough(30, 25, 10));
  }
}
