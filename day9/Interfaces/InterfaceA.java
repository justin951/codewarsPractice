package day9.Interfaces;

public interface InterfaceA {
  public void methodName(); // you don't implement the method!
}

// Interface declaration: by first user
interface Drawable {
  void draw();
}

// implementation: by second user
class Rectangle implements Drawable {
  public void draw() {
    System.out.println("drawing rectangle");
  }
}

class Circle implements Drawable {
  public void draw() {
    System.out.println("drawing circle");
  }
}

// using interface: by third user
class TestInterface1 {
  public static void main(String[] args) {
    Drawable d = new Circle(); // in real scenario, object is provided by method e.g. getDrawable()
    d.draw();
  }
}
