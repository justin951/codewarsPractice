package CodeWars;

public class Holiday {
  public static int dutyFree(int normPrice, int discount, int hol) {

    System.out.println("normPrice " + normPrice);
    System.out.println("discount " + discount);
    System.out.println("hol " + hol);

    double discountPercent = ((double)discount / 100);

    System.out.println("discountPercent " + discountPercent);

    double dicountPrice = normPrice * (1 - discountPercent);

    return (int) Math.floor( hol / (normPrice - dicountPrice));

  }

  public static void main(String[] args) {
    System.out.println(dutyFree(12, 50, 1000));
  }

}
