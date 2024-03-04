package day7.ErrorsExceptions;

public class Student {
  private String name;

  // constructor
  public Student(String name) {
    this.name = name;
  }

  // method to get the length of the student's name
  public int getNameLength() {
    return name.length(); // potential NullPointerException if name is null
  }

  public static void main(String[] args) {
    // creating a student with a null name
    Student student = new Student(null);

    try {
      // simulating a situation where the student's name is null
      int nameLength = student.getNameLength(); // this line will throw NullPointerException
      System.out.println("Name length: " + nameLength); // this line won't be reached
    } catch (NullPointerException e) {
      // handling the NullPointerException
      System.err.println("An error occurred: " + e.getMessage());
    }
  }
}
