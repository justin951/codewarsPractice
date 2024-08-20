package Singleton;

public class Singleton {
  public static Singleton onlyInstance = new Singleton();

  // this private constructor
  // means it will be the only instance
  private Singleton() {}

  public void doSomething() {
    System.out.println("I am doing something.");
  }
}

class LazySingleton {
  public static Singleton onlyInstance = null;

  private Singleton() {}

  public static Singleton getInstance() {
    if(onlyInstance == null) {
      onlyInstance = new Singleton();
    }
    return onlyInstance;
  }
}
