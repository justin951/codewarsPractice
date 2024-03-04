package day4;

public class Student {

  String name;
  int rollNo;

  static String cllgName;

  static int counter = 0;

  public Student(String name) {
    this.name = name;

    this.rollNo = setRollNo();
  }

  static int setRollNo() {
    counter++;
    return counter;
  }

  static void setCllg(String name) {
    cllgName = name;
  }

  void getStudentInfo() {
    System.out.println("name : " + this.name);
    System.out.println("rollNo : " + this.rollNo);

    System.out.println("cllgName : " + cllgName);
  }
}
