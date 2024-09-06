class IsPalendrome {
  public static boolean isPalendrome(String inputString) {
    if (inputString.length() <= 1) {
      return true;
    } else {
      char firstChar = inputString.charAt(0);
      char lastChar = inputString.charAt(inputString.length() - 1);
      String mid = inputString.substring(1, inputString.length() -1);
      return (firstChar == lastChar) && isPalendrome(mid);
    }
  }

  public static void main(String[] args) {
    System.out.println(isPalendrome("the"));
  }
}
