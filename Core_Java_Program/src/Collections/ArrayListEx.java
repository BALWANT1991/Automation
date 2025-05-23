package Collections;

// ArrayList Example
import java.util.ArrayList;

public class ArrayListEx {

  public static void main(String[] args) {
    // Creating an ArrayList of integers
    ArrayList<Integer> nums = new ArrayList<>();

    // Adding elements to ArrayList dynamically
    nums.add(10);
    nums.add(20);
    nums.add(30);

    // Accessing and printing ArrayList elements
    System.out.println(nums.get(2)); // Output: 30

    // Removing an element from the ArrayList
    nums.remove(2); // Remove element at index 3

    // Printing ArrayList
    System.out.println(nums); // Output: [10, 20]
  }
}
