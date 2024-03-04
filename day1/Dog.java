public class Dog {
  int age;

  public String bark() {
    return "wo0of";
  }

  public static void main(String[] args) {
    Dog max = new Dog();
    String dogBarking = max.bark();
    System.out.println(dogBarking);

    System.out.println("testme");
    System.out.println("testme");
  }
}
