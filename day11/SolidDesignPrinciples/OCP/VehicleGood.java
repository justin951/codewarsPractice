package day11.SolidDesignPrinciples.OCP;

interface Vehicle {
  public double accelerate();
}

class Car implements Vehicle {
  int speed;

  @Override
  public double accelerate() {
    this.speed += 10;
    return this.speed;
  }
}

class Truck implements Vehicle {
  int speed;

  @Override
  public double accelerate() {
    this.speed += 5;
    return this.speed;
  }
}
