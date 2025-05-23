package Collections;

// Collections Example
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(8);

    // Sorts the list
    Collections.sort(numbers);
    System.out.println(numbers); // Output: [2, 5, 8]

    // Reversing the order of elements
    Collections.reverse(numbers);
    System.out.println(numbers); // Output: [8, 5, 2]

    // Search for an element in the list
    int index = Collections.binarySearch(numbers, 5);
    System.out.println(index); // 1
  }
}
