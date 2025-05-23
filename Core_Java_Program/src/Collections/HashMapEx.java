package Collections;

// HashMap Example
import java.util.HashMap;
public class HashMapEx {
  public static void main(String[] args) {

    // Creating a HashMap to store key-value pairs 
    HashMap<String, Integer> marks = new HashMap<>();

    // Adding key-value pairs to the HashMap
    marks.put("Happy", 33);
    marks.put("Anurag", 34);
    marks.put("Rawat", 35);

    // Accessing and printing HashMap elements
    // (value associated with key "Anurag")
    System.out.println(marks);
    System.out.println(marks.get("Anurag")); 
    // Output: 34

    // Removing an element from the HashMap
    marks.remove("Rawat");
  }
}
