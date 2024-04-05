package LinkedListsPractice;

import java.util.*;

public class LinkedListPracticeFile {

  public static void main(String[] args) {
    System.out.println();
    String shazam = "Shazam";

    // create linked list
    LinkedList<String> superHeroes = new LinkedList<>();

    // add objects to list
    superHeroes.add("Superman");
    superHeroes.add("Wonderwoman");
    superHeroes.add(1, "Spiderwoman");
    superHeroes.add(shazam);
    superHeroes.addLast("Ladybug");
    superHeroes.add("The Flash");

    System.out.println(superHeroes);

    // get items from list
    System.out.println(superHeroes.getFirst());
    System.out.println(superHeroes.getLast());
    System.out.println(superHeroes.get(3));

    // change element in list
    superHeroes.set(5, "The Awesome Flsh");
    System.out.println(superHeroes);

    // remove objects from list
    superHeroes.remove("Shazam");
    System.out.println(superHeroes);
    // superHeroes.remove(1);
    // System.out.println(superHeroes);
    // superHeroes.removeFirst();
    // System.out.println(superHeroes);
    // superHeroes.removeLast();
    // System.out.println(superHeroes);

    // iterating through list
    for (String each : superHeroes) {
      System.out.println(each);
    }

    // empty list
    superHeroes.clear();
    System.out.println(superHeroes);
  }
}
