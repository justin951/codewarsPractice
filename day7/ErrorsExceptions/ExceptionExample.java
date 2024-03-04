package day7.ErrorsExceptions;

import java.util.Scanner;

public class ExceptionExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("You have entered: " + number);
  }
}
