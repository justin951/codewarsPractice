package Algorithm;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12};

    // loop through each element of the array
    for (int i = 0; i < arr.length - 1; i++) {
      // laset i elements are already sorted
      for (int j = 0; j < arr.length - i - 1; j++) {
        // compare adjacent elements and swap if needed
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
