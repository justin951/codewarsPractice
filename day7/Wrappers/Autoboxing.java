package day7.Wrappers;
import java.util.ArrayList;

public class Autoboxing {
  public static void main(String[] args) {
    char ch = 'a';

    // autoboxing - primitive to Character object conversion
    Character a = ch;

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    // here, autoboxing of the int 25 takes place because
    // arrayList only stores Integer objects
    arrayList.add(25);

    // printing the values from object
    System.out.println(arrayList.get(0));
  }
}
