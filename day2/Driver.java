package day2;

public class Driver {
  public static void main(String[] args) {
    int age = 20;
    String ageCategory = age >= 18 ? "Adult" : "Minor";
    System.out.println(ageCategory);

    if (age >= 18) {
      System.out.println("Person is an adult");
    }

    boolean isSunny = false;
    if (isSunny) {
      System.out.println("Let's go outside");
    } else {
      System.out.println("Let's stay indoors");
    }
    int month = 4;
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      default:
        System.out.println("not jan, feb, or march");
    }
    for (int i = 0; i < 100; i++) {
      System.out.println("i = " + i);
      // System.out.println(i);
    }
    System.out.println("================");
    int i = 101;
    while (i < 100) {
      System.out.println("i = " + i);
      // System.out.println(i);
      i++;
    }
    System.out.println("==================");
    int j = 101;
    do {
      System.out.println("i = " + i);
      // System.out.println(i);
      i++;
    } while (i < 100);
  }
}
