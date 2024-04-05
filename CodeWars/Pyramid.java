
public class Pyramid {
  /**
   * TODO: Return a string that is a pyramid of size n, made of of asterisks and
   * no spaces.
   *
   * for example:
   *
   * size 3:
   * *
   * **
   * ***
   *
   * size 5:
   * *
   * **
   * ***
   * ****
   * *****
   *
   * The newline character can be written as \n .
   * The tests will not be affected by a newline character at the beginning or end
   * of the entire pyramid.
   *
   * Here's a hint: you could use a for loop inside of a for loop for this
   * problem. The outer for loop
   * can determine the current 'row', and the inner for loop can print an asterisk
   * an amount of times based on the
   * current 'row'.
   *
   * @param n the size of the pyramid.
   * @return a string representation of the pyramid.
   */
  public static String returnPyramid(int n) {
    String result = "";
    String stars = "";
    // String[] arr = new String[n];

    for (int i = 0; i <= n - 1; i++) {
      stars += '*';
      // arr[i] = '\n' + stars;
      // System.out.println(stars);
      result += '\n' + stars;
    }

    return result;
  }

  public static void main(String[] args) {
    Integer a = 5;
    System.out.println(returnPyramid(a));
  }
}
