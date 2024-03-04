package day9.AccessModifiers;

class A {
  private A(){} // private constructor
  private int data = 40;

  private void msg() {
    System.out.println("Hello java");
  }
}

public class Simple {
  public static void main(String[] args) {
    A obj = new A(); // compile time error
    System.out.println(obj.data); // compile time error
    obj.msg(); // compile time error
  }
}
