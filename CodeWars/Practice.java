import java.util.List;
import java.util.ArrayList;

public class Practice {
  public int[] combine(int[] arr1, int[] arr2) {
    List<Integer> myList = new ArrayList<>();
    for (int each : arr1) {
      myList.add(each);
    }
    for (int each : arr2) {
      myList.add(each);
    }
    int[] result = new int[myList.size()];
    for (int i = 0; i < myList.size(); i++) {
      result[i] = myList.get(i);
    }
    return result;
  }
}


//

class IndexOf {
  /**
   * Find the position of a number in an array.
   * For example, the position of 7 in {0,1,7,3,4} is 2.
   *
   * @param arr an int array.
   * @param n a possible value of arr.
   * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
   */
  public int getIndex(int[] arr, int n){
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == n) return i;
      }
      return -1;
  }

  public static void main(String[] args) {
    
  }
}
