package day3;

public class SwitchStatement {
  public static void main(String[] args) {
    int x = 10;

    switch (x) {
      case 6: {
        System.out.println("case 6 ran");
        break;
      }
      case 7: {
        System.out.println("case 7 ran");
        break;
      }
      case 10: {
        System.out.println("case 10 ran");
        break;
      }
      default:
        System.out.println("The default case ran.");
    }
  }
}
