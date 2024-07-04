package arraysUse;
import java.util.*;
public class SearchElementsInArrayListExample {

	public static void main(String[] args) {
    
		List<String> names = new ArrayList<>();
        
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));
        System.out.println("Any name realted to john bhai :"+names.contains("John"));
        System.out.println("Searching by index :"+names.indexOf("Alice"));
        System.out.println("Seaching for last Index :"+names.lastIndexOf("Maria"));

}
}