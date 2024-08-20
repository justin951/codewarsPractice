package Collections.Generic;

import java.util.*;

public class SetPractice {

  public void practiceSet() {

    // creating a set object
//    Set<String> anime = new HashSet<>(); // OR
    SortedSet<String> anime = new TreeSet<>(); // cannot contain 'null' values
    

    // another way to create a Set Object
    HashSet<Integer> values = new HashSet<Integer>();
    HashSet<String> otherValues = new HashSet<String>();

    // add elements to the set
    anime.add("Frieren");
    anime.add("Witch From Mercury");
    anime.add("Gushing Over Magical Girls");
    anime.add("One-Punch Man");
    anime.add("throwaway");

    // loop through the set (1st way)
    for (String characters : anime) {
      System.out.println(characters);
    }

    // loop through the set (2nd way)
    Iterator<String> iter = anime.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

    // get size of Set
    System.out.println(anime.size());
    System.out.println();

    // does set contain specific value
    if(anime.contains("Frieren")) {
      System.out.println("First Line\n" + "Second Line");
    }else{
      System.out.println("Nah fam");
    }

    // remove element from set
    anime.remove("throwaway");

    // print again
    for(String characters2 : anime) {
      System.out.println(characters2);
    }
  }
}
