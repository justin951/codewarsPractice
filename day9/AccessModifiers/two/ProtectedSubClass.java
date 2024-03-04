package day9.AccessModifiers.two;

import day9.AccessModifiers.one.ProtectedClass;

public class ProtectedSubClass extends ProtectedClass {
  public static void main(String[] args) {
    ProtectedSubClass pcs = new ProtectedSubClass();
    pcs.printID();
  }
}
