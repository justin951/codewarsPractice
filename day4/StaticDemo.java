package day4;

public class StaticDemo {
  public static void main(String[] args) {
    Student.setCllg("XYZ");

    Student s1 = new Student("Alice");
    Student s2 = new Student("Bob");

    s1.getStudentInfo();
    s2.getStudentInfo();
  }
}
