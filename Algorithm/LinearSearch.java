package Algorithm;

// code for linearly searching x in arr[].
// if x is present, returns index
// otherwise, returnse false
public class LinearSearch {
  public static int search(int arr[], int x) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) return i;
    } return -1;
  }

  // driver code
  public static void main(String args[]) {
    int arr[] = {2, 3, 4, 10, 40};
    int x = 10;

    // function call
    int result = search(arr, x);
    if (result == -1) {
      System.out.print(
        "Element is not preset in array"
        );
    } else {
      System.out.print("Element is present at index " + result);
    }
  }
}
