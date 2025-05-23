package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCollectionsEx {

  public static void main(String[] args) {
    // Creating a list of integers using generics
    List<Integer> numbers = new ArrayList<>();

    // Adding integers to the list
    numbers.add(10);
    numbers.add(20);

    // Creating a list of strings using generics
    List<String> strings = new ArrayList<>();
    strings.add("Interview");
    strings.add("Happy");
  }
}
