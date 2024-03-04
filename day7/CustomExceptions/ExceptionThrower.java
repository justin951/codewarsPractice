package day7.CustomExceptions;

public class ExceptionThrower {

  public static void main(String[] args) {
    try {
      throw new MyCheckedException("uh oh");
    } catch (MyCheckedException e) {
    } // we're just ignoring it here

    if (100 > 1) {
      throw new MyUncheckedException("you're not required to handle me!");
    }
  }

  public static void declareChecked() throws MyCheckedException {
    throw new MyCheckedException("this one is declared!");
  }
}
