package day8.ObjectClass;

public class Team {
  String city;
  String department;

  @Override
  public final boolean equals(Object o) {
    // implementation
  }

  @Override
  public final int hashCode() {
    int result = 17;
    if (city != null) {
      result = 31 * result + city.hashCode();
    }
    if (department != null) {
      result = 31 * result + department.hashCode();
    }
    return result;
  }
}
