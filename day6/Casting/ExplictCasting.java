package day6.Casting;

public class ExplictCasting {
  public static void main(String[] args) {
    short s = 150;
    byte b = s; // this will not compile without an explicit cast
    // and in this case, even with an explicit cast, there will be data loss
    // as bytes can only hold values up to 127
    // b would actually hold the value -106 here
  }
}
