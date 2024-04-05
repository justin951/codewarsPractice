package Iterators;

import java.util.*;

public class EnhancedForLoop {
  public static void main(String[] args) {
    int[] intArr = new int[] { 48, 21, 77, 15 };
    System.out.println("Standard For-Leep [Array]");
    for (int i = 0; i < intArr.length; i++) {
      System.out.println(intArr[i]);
    }

    for (int a : intArr) {
      System.out.println(a);
    }

    NodeStack ns = new NodeStack();
    ns.push(48);
    ns.push(21);
    ns.push(77);
    ns.push(15);
    System.out.println("Enhanced For Loop [NodeStack]");
    for (Node n : ns) {
      System.out.println(n);
    }
  }
}
