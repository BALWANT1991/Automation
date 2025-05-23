package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyEx {

  public static void main(String[] args) {
    String name = "Interview Happy";
    name = 10; // Comppile time error 

    // Creating a list of integers using generics
    List<Integer> numbers = new ArrayList<>();
   
    numbers.add(10);
    // Comppile time error due to type safety, 
    // compiler ensures that you must use the correct type
    numbers.add("Happy"); 
  }
}
