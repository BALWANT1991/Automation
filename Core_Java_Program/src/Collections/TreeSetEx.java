package Collections;

// TreeSet Example
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {
    // Creating a TreeSet of integers
    TreeSet<Integer> numsSet = new TreeSet<>();

    // Adding elements to the TreeSet
    numsSet.add(20);
    numsSet.add(10);
    numsSet.add(30);

    // Accessing elements in the TreeSet
    System.out.println(numsSet); // [10, 20, 30]

    // Accessing a specific element
    // (not supported by Set directly)
    // Removing an element from the TreeSet
    numsSet.remove(30);
  }
}
