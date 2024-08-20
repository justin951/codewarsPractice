import java.util.*;

public class ArrayAbsoluteValue {

  public static int[] getArrayAbs(int[] nums) {
    int[] absNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      absNums[i] = Math.abs(nums[i]);
    }
    return absNums;
  }


  public static void main(String[] args) {
    int[] input1 = {-1 , 0 , 1, -5, 5};
    System.out.println(Arrays.toString(getArrayAbs(input1)));
  }
}


  /**
   * Given an array of integers 'nums', produce an array of integers composed of
   * the absolute values of all the
   * numbers in 'nums'. Absolute value represents the distance from zero, so
   * negative numbers should become positive
   * and positive numbers should stay the same.
   *
   * @param nums an array.
   * @return the absolute value array of nums.
   */
