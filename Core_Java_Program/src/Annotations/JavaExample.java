package Annotations;

import java.io.*;
import java.util.*;

// Custom annotation definition
@interface MethodInfo {
  String author() default "John Doe";

  String version() default "1.0";
}

// Generic class with bounded type parameter
class Calculator<T extends Number> {

  public boolean isEqual(T value1, T value2) {
    return value1.equals(value2);
  }
}

// Thread subclass to demonstrate multithreading
class MyThread extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(
        "Thread: " + Thread.currentThread().getId() + " - Count: " + i
      );
      try {
        Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class JavaExample {

  // Method using custom annotation
  @MethodInfo(author = "Alice", version = "2.0")
  public static void performOperation() {
    Calculator<Integer> intCalculator = new Calculator<>();
    boolean result = intCalculator.isEqual(10, 10);
    System.out.println("Is 10 equal to 10? " + result);

    try {
      // Writing to a file using BufferedWriter
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Hello, world!");
      writer.close();

      // Reading from a file using BufferedReader
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line = reader.readLine();
      System.out.println("File content: " + line);
      reader.close();
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    // Create and start a new thread
    MyThread thread1 = new MyThread();
    thread1.start();

    // Main thread continues execution
    for (int i = 1; i <= 3; i++) {
      System.out.println(
        "Main Thread: " + Thread.currentThread().getId() + " - Count: " + i
      );
      try {
        Thread.sleep(1500); // Sleep for 1.5 seconds
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // Perform operation with custom annotation
    performOperation();
  }
}
