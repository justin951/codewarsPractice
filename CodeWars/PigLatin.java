
public class PigLatin {
  /**
   * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
   * word.
   *
   *     example:
   *     word = ordway
   *     pig = igpay
   *     latin = atinlay
   *
   * Take in a word and return the pig latin form. You will need to use the substring method of String to break
   * up the string.
   * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
   *
   * @param in A string.
   * @return the pig latin form of in.
   */
  public static String returnPigLatin(String in){

      return in.substring(1, in.length()) + in.charAt(0) + "ay";
  }

  public static void main(String[] args) {
    System.out.println(returnPigLatin("there is more than one word in this sentence"));
  }
}
