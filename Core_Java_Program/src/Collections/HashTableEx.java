package Collections;

// HashTable Example
import java.util.Hashtable;
public class HashTableEx {

  public static void main(String[] args) {
    
    // Creating a Hashtable to store key-value pairs
    Hashtable<String, Integer> marks = new Hashtable<>();

    // Adding key-value pairs to the Hashtable
    marks.put("Happy", 33);
    marks.put("Anurag", 34);
    marks.put("Rawat", 35);

    // Accessing and printing Hashtable elements
    // (value associated with key "Anurag")
    System.out.println(marks.get("Anurag"));
    // Output: 34

    // Removing an element from the Hashtable
    marks.remove("Rawat");
  }
}
