package day7.CustomExceptions;

class MyException extends Exception {
  public MyException(String s) {
    super(s);
  }
}

class Main {
  // driver program
  public static void main(String[] args) {
    try {
      // throw an object of user defined execption
      throw new MyException("GeeksGeeks");
    } catch (MyException ex) {
      System.out.println("Caught");

      // print the message from MyException object
      System.out.println(ex.getMessage());
    }
  }
}

class MyException2 extends Exception {
}

public class setText {
  // driver program
  public static void main(String[] args) {
    try {
      // throw an object of user defined exception
      throw new MyException2();
    } catch (MyExeception2 ex) {
      System.out.println("Caught");
      System.out.println(ex.getMessage());
    }
  }
}
