package Collections;

// LinkedList Example
import java.util.LinkedList;

public class LinkedListEx {

  public static void main(String[] args) {
    // Creating a LinkedList of integers
    LinkedList<Integer> nums = new LinkedList<>();

    // Adding elements to LinkedList dynamically
    nums.add(10);
    nums.add(20);
    nums.add(30);

    // Accessing and printing LinkedList elements
    System.out.println(nums.get(2)); // 30

    // Removing an element from the LinkedList
    nums.remove(2); // Remove element at index 2
  }
}
