package day3;

public class WhileExample {
  // public static void main(String args[]) {
  // boolean on = true;

  // while (on) {
  // System.out.println("inside the while loop");
  // on = false;
  // }

  // int x = 1;

  // while (x <= 5) {
  // System.out.println("x is " + x);
  // x++;
  // }
  // }

  // public class ExampleOne {

  // public static void main(String args[]) {
  // boolean on = false;

  // do {
  // System.out.println("Inside the do-while loop");
  // } while (on);
  // }
  // }

  // Java program to demonstrates using break with goto
  class Main {
    public static void main(String args[]) {
      // First label
      first: for (int i = 0; i < 3; i++) {
        // Second label
        second: for (int j = 0; j < 3; j++) {
          if (i == 1 && j == 1) {

            // Using break statement with label
            break first;
          }
          System.out.println(i + " " + j);
        }
      }
    }
  }
}
