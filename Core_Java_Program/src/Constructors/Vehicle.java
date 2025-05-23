package Constructors;

public class Vehicle {

  private String brand;

  public Vehicle(String brand) {
    this.brand = brand;
  }

  public Vehicle() {
    // Constructor chaining (Calls the other constructor)
    this("Honda");
  }

  public String getBrand() {
    return brand;
  }

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    System.out.println(vehicle.getBrand()); // Honda
  }
}
