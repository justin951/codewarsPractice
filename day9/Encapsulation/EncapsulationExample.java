package day9.Encapsulation;

class EmployeeCount {
  private int numOfEmployees = 0;

  public void setNumOfEmployees(int count) {
    numOfEmployees = count;
  }

  public double getNumOfEmployees() {
    return numOfEmployees;
  }
}

public class EncapsulationExample {
  public static void main(String[] args) {
    EmployeeCount obj = new EmployeeCount();
    obj.setNumOfEmployees(5613);
    System.out.println("No of Employees: " + (int)obj.getNumOfEmployees());
  }
}
