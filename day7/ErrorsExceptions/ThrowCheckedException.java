package day7.ErrorsExceptions;

import java.io.IOException;

public class ThrowCheckedException {

  // A method that throws a checked exception
  public static void readFile(String file) throws IOException {
    // Code to read a file (simulated)
    // For the sake of the example, let's assume this method can throw IOException
    throw new IOException("File not found" + file);
  }

  public static void main(String[] args) {
    // Specifying the file path to be read
    String filePath = "path_to_file";
    // Calling the method without proper handling or declaration
    // readFile(filePath); // Compilation error here if not handled or declared

    // The previous code will not compile unless you handle the exception or declare
    // it.
    // Comment out the readFile() and we will handle the exception below
    // Uncommenting the next line would handle the compilation error.
    try {
    readFile(filePath); //note we are referencing the method here in the try
    // block as this is the method that will throw the exception.
    } catch (IOException e) {
    // Handle the exception
    System.out.println("IOException: " + e.getMessage());
    }
  }
}
