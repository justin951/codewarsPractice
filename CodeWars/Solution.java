package CodeWars;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
    int target = 11;
    int[] result = twoSum(arr1, target);
    System.out.println(Arrays.toString(result));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return new int[] { -1, -1 };
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
