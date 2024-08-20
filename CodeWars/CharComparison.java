import java.util.*;

public class CharComparison {

  public static int compare(char[] a, char[] b) {
    int lowerLength = a.length < b.length ? a.length : b.length;
    for (int i = 0; i < lowerLength; i++) {
      if (aIsLess(a[i], b[i]) == 0) {
        System.out.println("a is equal");
      } else if (aIsLess(a[i], b[i]) == -1) {
        System.out.println("a is less");
        return -1;
      } else if (aIsLess(a[i], b[i]) == 1) {
        System.out.println("a is greater");
        return 1;
      }
    }
    return 0;
  }

  public static int aIsLess(char a, char b) {
    if (a < b) {
      return -1;
    } else if (a > b) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    char[] input1 = { 'm', 'o', 'u', 's', 'e'};
    char[] input2 = { 'd', 'o', 'g'};
    System.out.println(compare(input1, input2));
  }
}

/**
 * Given an array of char, determine if the array A belongs to the left or to
 * the right of char array B lexigraphically.
 * That means its position in a dictionary, eg:
 * cat < dog < mouse
 * car < care < cat
 * You will need to compare an index of both arrays against each other as you
 * iterate with a for loop.
 *
 * @param a an array of char.
 * @param b an array of char.
 * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two
 *         arrays are identical.
 */
