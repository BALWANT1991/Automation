package Collections;

// HashSet Example
import java.util.HashSet;

public class HashSetEx {
  public static void main(String[] args) {
    // Creating a HashSet of integers
    HashSet<Integer> numsSet = new HashSet<>();

    // Adding elements to the HashSet
    numsSet.add(10);
    numsSet.add(20);
    numsSet.add(30);
    numsSet.add(20); // duplicate not allowed

    // Accessing elements in the HashSet
    System.out.println(numsSet); // [20, 10, 30]

    // Access a specific element -not supported

    // Removing an element from the HashSet
    numsSet.remove(30);

    System.out.println(numsSet); // [20, 10]
  }
}
