package day6.Casting;

public class ExplicitCasting2 {
  public static void main(String[] args) {
    float f = 10.23f;
    int i = f; // this will also not compile without an explicit cast
    // although floats and ints are both represented in memory with 32 bits,
    // floats can hold decimal values while ints cannot
    // we can explicitly cast these values, but we lose .23
    // i holds the value 10
  }
}
