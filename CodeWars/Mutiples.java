package CodeWars;

import java.util.ArrayList;

public class Mutiples {
  public static int[] find(int base, int limit) {
    ArrayList<Integer> multiplesList = new ArrayList<>();
    for (int i = base; i <= limit; i++) {
      if (i % base == 0) {
        multiplesList.add(i);
      }
    }

    int[] multiplesArray = new int[multiplesList.size()];
    for (int i=0; i < multiplesList.size(); i++) {
      multiplesArray[i] = multiplesList.get(i);
    }

    return multiplesArray;
  }

  public static void main(String[] args) {
    int[] result = find(4, 25);
    for (int num : result) {
      System.out.print(num + " ");
    }
    // System.out.println(find(4, 25));
  }
}
