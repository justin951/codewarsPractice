package day7.HandlingExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFinallyWithoutCatchExample {

  public static void main(String[] args) {
    BufferedReader reader = null;

    try {
      // Need to have a file called demo on your computer for this to work
      reader = new BufferedReader(new FileReader("demo.txt"));
      String line = reader.readLine();
      // Process the file data
      System.out.println("Read from file: " + line);
    } finally {
      try {
        if (reader != null) {
          reader.close(); // This block will always run, ensuring the resource is closed
        }
      } catch (IOException e) {
        System.err.println("An IOException occurred while closing the reader: " + e.getMessage());
      }
    }
  }
}
