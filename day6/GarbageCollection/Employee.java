package day6.GarbageCollection;

// import day6.Casting.Example;

class Employee {

  private int ID;
  private String name;
  private int age;
  private static int nextId = 1;

  // it is made static because it
  // is keep common among all and
  // shared by all objects
  public Employee(String name, int age)
  {
      this.name = name;
      this.age = age;
      this.ID = nextId++;
  }
  public void show()
  {
      System.out.println("Id=" + ID + "\nName=" + name
                         + "\nAge=" + age);
  }
  public void showNextId()
  {
      System.out.println("Next employee id will be="
                         + nextId);
  }
  protected void finalize()
  {
      --nextId;
      // In this case,
      // gc will call finalize()
      // for 2 times for 2 objects.
  }
}


