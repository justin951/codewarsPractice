package day7.Wrappers;

public class AutoboxingExample {
  public static void main(String[] args) {
    int n = 5; // we start by declaring an int for a primitive type
    someMethod(n); // autoboxing is done here to wrap the Integer class around int n.
      // 8
  }

  public static void someMethod(Integer i) {
    System.out.println(i + 3);
  }
}
