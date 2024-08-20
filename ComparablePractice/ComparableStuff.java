package ComparablePractice;

import java.util.*;

class Student implements Comparable<Student> { // implements requires override of compareTo from Comparable
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    // return "Student [age=" + age + "], name=" + name + "]";
    return String.format("Student [age=%d, name=%s]", age, name);
  }

  @Override
  public int compareTo(Student that) {
    if (this.age > that.age)
      return 1;
    else
      return -1;
  }

}

public class ComparableStuff {
  public static void main(String[] args) {

    Comparator<Student> com = (Student i, Student j) -> {
      if (i.age > j.age)
        return 1;
      else
        return -1;
    };

    // Comparator<Student> com = new Comparator<Student>() {
    // public int compare(Student i, Student j) {
    // if (i.age > j.age)
    // return 1;
    // else
    // return -1;
    // }
    // };

    List<Student> students = new ArrayList<>();
    students.add(new Student(21, "Matthew"));
    students.add(new Student(15, "Mark"));
    students.add(new Student(20, "Luke"));
    students.add(new Student(24, "John"));

    Collections.sort(students); // if implementing Comparable by overriding the compareTo
    // Collections.sort(students, com); // if overloading sort

    for (Student student : students) {
      System.out.println(student);
    }

    // System.out.println(students);
  }
}
