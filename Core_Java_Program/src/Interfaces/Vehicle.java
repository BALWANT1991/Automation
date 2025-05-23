package Interfaces;

public interface Vehicle {
  // Abstract method
  void start();

  // Default method
  default void stop() {
    System.out.println("Stop...");
  }
}

