package day9.AccessModifiers;

import day9.AccessModifiers.two.*;

public class AccessModifiers {
  public static void main(String[] args) {
    // access class methods here
    Person adam = new Person(); // create instance of Person class
    adam.age = 15; // set Person object's age field

    System.out.println(adam.age);

    ProtectedSubClass psc = new ProtectedSubClass();
    psc.printID();
  }
}
