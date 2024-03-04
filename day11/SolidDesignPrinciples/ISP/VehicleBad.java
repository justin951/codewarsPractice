package day11.SolidDesignPrinciples.ISP;

interface Vehicle {
  public void accelerate();
  public void breaking();
  public void openDoors();
}

class Bike implements Vehicle {
  public void accelerate() {
    // implementation...
  }

  public void breaking() {
    // implementation...
  }

  public void openDoors(){
    // bikes to not have doors so this does not follow
    // ISP and shouldn't be forced to impelement a method
    // it can't use
  }
}
