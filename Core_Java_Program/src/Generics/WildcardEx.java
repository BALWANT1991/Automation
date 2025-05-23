package Generics;

// Wildcard example
import java.util.List;

public class WildcardEx {

  public static void main(String[] args) {
    // list of Strings
    List<String> stringList = List.of("Interview", "Happy");

    // list of Integers
    List<Integer> integerList = List.of(1, 2, 3);

    printListContents(stringList); // Interview Happy  
    printListContents(integerList); // 1 2 3
  }

  // Method to print the List of any type using wildcard <?>
  public static void printListContents(List<?> list) {
    for (Object element : list) {
      System.out.println(element);
    }
  }
}
