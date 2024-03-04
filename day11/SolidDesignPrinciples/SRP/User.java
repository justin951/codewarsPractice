package day11.SolidDesignPrinciples.SRP;

class User {
  // this violates SRP (single repsonsibility principle)
  // because of the two distinct purposes in this class
  public boolean authenticateUser(){
    // authentication logic here
    return false;
  }

  public void createUser(){
    // user persistence logic here
  }
}
