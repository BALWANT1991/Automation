package ShortQuestions;

import java.util.ArrayList;
import java.util.List;

public class Superclass {

  public static void main(String[] args) {
    // List<Object> example
    List<Object> objectList = new ArrayList<>();
    // Adding elements to List<Object> is allowed
    objectList.add("String");
    objectList.add(123);

    // List<?> example
    List<?> wildcardList = new ArrayList<String>();
    // Adding elements to List<?> is not allowed (except null)
    // wildcardList.add("String"); // Compile-time error
    wildcardList.add(null); // This is allowed
  }
}


