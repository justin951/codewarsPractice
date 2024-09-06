import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = { 2, 4 };

    int[] result = arrayDiff(a, b);

    System.out.print("Result: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> newList = new ArrayList<>();
    for (int each : a) {
      if (!contains(b, each)) {
        newList.add(each);
      }
    }
    int[] result = new int[newList.size()];
    for (int i = 0; i < newList.size(); i++) {
      result[i] = newList.get(i);
    }
    return result;
  }

  public static boolean contains(int[] arr, int target) {
    for (int num : arr) {
      if (num == target) {
        return true;
      }
    }
    return false;
  }
}
