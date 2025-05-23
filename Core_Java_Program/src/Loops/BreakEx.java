package Loops;

public class BreakEx {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        break; // Exit the loop
      }
      System.out.println(i);
    }
    
  }
} 
