package Collections.Generic;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // create HashMap (HashMaps are unordered)
    HashMap<String, Integer> areaCodeMap = new HashMap<>();

    // add elements to map
    areaCodeMap.put("Tucson", 123);
    areaCodeMap.put("Orlando", 234);
    areaCodeMap.put("Livonia", 345);
    areaCodeMap.put("Wyandotte", 456);
    areaCodeMap.put("Chicago", 654);

    // print size of HashMap
    System.out.println("the size of the map is: " + areaCodeMap.size());

    // print the entries of map
    System.out.println(areaCodeMap.entrySet());

    // remove element
    areaCodeMap.remove("Chicago");
    System.out.println(areaCodeMap.entrySet());

    // print value if key in hashmap
    if (areaCodeMap.containsKey("Wyandotte")) {
      System.out.println("Wyandotte's area code is: " + areaCodeMap.get("Wyandotte"));
    } else {
      System.out.println("That city is not in the HashMap.");
      System.out.println(areaCodeMap.containsValue(456));
    }

    // iterate with key + value
    for (String key : areaCodeMap.keySet()) {
      System.out.println("The area code for " + key + " is " + areaCodeMap.get(key));
    }

    class chatExample {
      static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> populationMap = new HashMap<>();
        populationMap.put("New York", 8398748);
        populationMap.put("Los Angeles", 3990456);
        populationMap.put("Chicago", 2705994);

        // Iterate through the HashMap's keys and values
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
          String city = entry.getKey();
          int population = entry.getValue();
          System.out.println("City: " + city + ", Population: " + population);
        }
      }
    }
  }
}
