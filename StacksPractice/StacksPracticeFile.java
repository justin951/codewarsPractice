package StacksPractice;

import java.util.*;

public class StacksPracticeFile {
  public static void main(String[] args) {
    // stacks are first-in, last-out
    Stack<String> kongCharacters = new Stack<>(); // stack is legacy
    Deque<String> deck = new ArrayDeque<>(); // deque "deck" is new hotness

    // add items to stack
    kongCharacters.push("Donkey Kong");
    kongCharacters.push("Diddy Kong");
    kongCharacters.push("Dixie Kong");
    kongCharacters.push("King K. Rool");
    kongCharacters.push("Candy Kong");
    kongCharacters.push("Donkey Kong Jr");
    kongCharacters.push("Tiny Kong");
    kongCharacters.push("Cranky Kong");

    System.out.println(kongCharacters);

    // size of stack
    System.out.println(kongCharacters.size());

    // top of stack without removing
    System.out.println(kongCharacters.peek());

    // search element by distance from top of stack (top is "1")
    System.out.println(kongCharacters.search("Cranky Kong")); // 1
    System.out.println(kongCharacters.search("Dixie Kong")); // 6

    // remove top item from stack
    System.out.println(kongCharacters.pop());

    // empty() tests if stack is empty, returns true/false
    System.out.println(kongCharacters.empty());
    while (!kongCharacters.empty()) {
      System.out.println(kongCharacters.pop());
    }
    System.out.println(kongCharacters.empty());
  }
}
