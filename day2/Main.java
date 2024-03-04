package day2;

public class Main {
  // public static void main(String[] args) {
  //   double area = calculateArea(3.5, 7.0);
  //   System.out.println("The area of the triangle 1 is " + area);

  //   area = calculateArea(4.0, 10.0);
  //   System.out.println("The area of the triangle 2 is " + area);

  //   area = calculateArea(12.0, 3.0);
  //   System.out.println("The area of the triangle 2 is " + area);

  // }

  // public static double calculateArea(double triangleBase, double traingleHeight) {
  //   double area = (triangleBase * traingleHeight) / 2;

  //   return area;
  // }

  public static void main(String args[]){
    int a=10;
    int b=5;
    int c=20;
    System.out.println(a>b||a<c);//true || true = true
    System.out.println(a>b|a<c);//true | true = true
    //|| vs |
    System.out.println(a>b||a++<c);//true || true = true
    System.out.println(a);//10 because second condition is not checked
    System.out.println(a>b|a++<c);//true | true = true
    System.out.println(a);//11 because second condition is checked
}

}
