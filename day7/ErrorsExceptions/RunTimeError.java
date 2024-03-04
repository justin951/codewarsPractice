package day7.ErrorsExceptions;

import org.apache.commons.math3.util.ArithmeticUtils;

public class RunTimeError {
  public static void main(String[] args) {
    // Attempt to use Apache Commons Math to compute the factorial of 5
    long factorial = ArithmeticUtils.factorial(5);
    System.out.println("Factorial of 5: " + factorial);
  }
}
