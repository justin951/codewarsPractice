package day11.SolidDesignPrinciples.OCP;

// incorrect
class VehicleBad {
  int speed;

  public double accelerate(VehicleBad v) {
    if (v instanceof Car) {
      return v.speed += 10;
    }
    if (v instanceof Truck) {
      return v.speed += 5;
    }
    return 0;
  }
}

class Car extends VehicleBad {
}

class Truck extends VehicleBad {
}
