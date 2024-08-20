public class NearestSquareRoot {
  public static int nearestSq(final int n){
      if (Math.sqrt(n) / 1 == Math.floor(Math.sqrt(n))) {
        return n;
      } else {
        int upper = (int) Math.ceil(Math.sqrt(n));
        int upperSquare = upper * upper;
        int lower = (int) Math.floor(Math.sqrt(n));
        int lowerSquare = lower * lower;
        return Math.abs(lowerSquare - n) > Math.abs(upperSquare - n) ? upperSquare : lowerSquare;
      }
    }

  public static void main(String[] args) {
    int input1 = 32;
    System.out.println(nearestSq(input1));
  }
}
