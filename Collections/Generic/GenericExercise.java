package Collections.Generic;

public class GenericExercise<T> {
  T data;

  public void loadGenericItem(T in) {
    this.data = in;
  }

  public T returnGenericItem() {
    return data;
  }
}

// Generic Class Declaration:

// public class GenericExercise<T>: This line declares a generic class named
// GenericExercise with a type parameter T. The angle brackets <T> indicate that
// T is a placeholder for a type that will be specified when instances of this
// class are created. This allows the class to work with different types of
// objects.

// Generic Field:

// T data;: This line declares a field named data of type T. Here, T represents
// the generic type parameter of the class. This field will be used to store an
// object of type T.

// loadGenericItem Method:

// public void loadGenericItem(T in) { ... }: This method is a setter method
// that takes an argument of type T named in. It assigns the value of in to the
// data field. Essentially, it allows you to load an object of any type T into
// the data field of the GenericExercise instance.

// returnGenericItem Method:

// public T returnGenericItem() { ... }: This method is a getter method that
// returns an object of type T. It simply returns the value stored in the data
// field. The return type of this method is T, indicating that it will return an
// object of the same type as the one stored in the data field.

GenericExercise<Integer> intExercise = new GenericExercise<>();intExercise.loadGenericItem(10);
Integer intValue = intExercise.returnGenericItem(); // intValue will be 10

GenericExercise<String> stringExercise = new GenericExercise<>();stringExercise.loadGenericItem("Hello");
String stringValue = stringExercise.returnGenericItem(); // stringValue will be "Hello"

// In the above example, T is specified as Integer for the intExercise instance
// and as String for the stringExercise instance. This allows you to work with
// different types of objects using the same GenericExercise class.
