package day7.ErrorsExceptions;

public class StackOverflowErrorExample {
  public static void main(String[] args) {
    // infinite loop
    while (true) {
      // each iteration addsa new frame to the call stack
      loopMethod();
    }
  }

  public static void loopMethod() {
    // body of the loop method
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      // performing some operation in the loop
      array[i] = i * 2;
    }
  }
}
