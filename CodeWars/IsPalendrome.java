class IsPalendrome {
  public static boolean recursivePalendrome(String inputString) {
    if (inputString.length() <= 1) {
      return true;
    } else {
      char firstChar = inputString.charAt(0);
      char lastChar = inputString.charAt(inputString.length() - 1);
      String mid = inputString.substring(1, inputString.length() - 1);
      return (firstChar == lastChar) && recursivePalendrome(mid);
    }
  }

  public static boolean reverseStringPalendrome(String inputString) {
    return inputString.equals(new StringBuilder(inputString).reverse().toString());
  }

  public static boolean charArrayPalendrome(String word) {
    int indexL = 0;
    int indexR = word.length() - 1;
    String wordLower = word.toLowerCase();
    char[] charArr = wordLower.toCharArray();

    for (int i = 0; i < charArr.length; i++) {
      if (charArr[indexL] == charArr[indexR]) {
        indexL++;
        indexR--;
      } else {
        return false;
      }
    }
    return true;
  }

  public static boolean stringCharAtPalendrome(String input) {
    if (input.length() <= 1) {
      return true;
    }
    int indexL = 0;
    int indexR = input.length()-1;

    for (int i = 0; i < (input.length() / 2) + 1; i++) {
      if (input.charAt(indexL) == input.charAt(indexR)) {
        indexL++;
        indexR--;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String input = "asdfgfdsa";
    System.out.println(recursivePalendrome(input));
    System.out.println(reverseStringPalendrome(input));
    System.out.println(charArrayPalendrome(input));
    System.out.println(stringCharAtPalendrome(input));
  }
}
