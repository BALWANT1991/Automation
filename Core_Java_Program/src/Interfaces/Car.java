package Interfaces;

public class Car implements Vehicle {

  public void start() {
    System.out.println("Start...");
  }

  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.start(); // Output: Start...

    myCar.stop(); // Output: Stop...
  }
}
