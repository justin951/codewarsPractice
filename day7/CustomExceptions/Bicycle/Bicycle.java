package day7.CustomExceptions.Bicycle;

public class Bicycle {
  public int speed = 0;
  public int gear = 1;

  public static String bikeShow = "RevaBikes";
  public static final int MAX_SPEED = 25;
  public static final int MAX_GEAR = 3;

  public void speedUp(int increment) {
    if (this.speed + increment > MAX_SPEED) {
      speed = 25;
      gear = 3;
      System.out.println("Cannot exceed maximum speed of 25.");
      return;
    } else {
      this.speed += increment;
      gear = gear < MAX_GEAR ? gear + 1 : 3;
    }
  }

  public void slowDown(int decrement) throws NegativeSpeedException {
    if (this.speed - decrement < 0) {
      throw new NegativeSpeedException();
    } else {
      this.speed -= decrement;
      gear = gear > 1 ? gear - 1 : 1;
    }
  }
}
