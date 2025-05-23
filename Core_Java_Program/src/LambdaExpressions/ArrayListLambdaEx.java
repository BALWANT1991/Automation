package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLambdaEx {

  public static void main(String[] args) {
    // Creating an ArrayList of strings
    List<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    // Iterating over the list without lambda expression
    for (String fruit : list) {
      System.out.println(fruit);
    }
    // Output: Apple Banana Orange

    // Iterating over the list using lambda expression
    list.forEach((fruit) -> {System.out.println(fruit);});
    // Output: Apple Banana Orange
  }
}
