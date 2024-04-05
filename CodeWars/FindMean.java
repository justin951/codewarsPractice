package CodeWars;

public class FindMean {
  public static int findAverage(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
    }
    return result / nums.length;
  }

  public static void main(String[] args) {
    System.out.println(findAverage(new int[] { 1, 3, 5, 7 }));
  }
}
