package Loops;

public class ContinueEx {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        continue; // Skip the rest of the loop
      }
      System.out.println(i);
    }
  }
} 
