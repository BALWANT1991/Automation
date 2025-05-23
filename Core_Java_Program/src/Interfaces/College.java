package Interfaces;

public class College implements University {

  // Must implement abstract methods
  public void courses() {
    System.out.println("P, C, M");
  }

  public void sports() {
    System.out.println("football");
  }
}
