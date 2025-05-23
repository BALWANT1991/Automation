package String;

public class StringBuilderExample {

  public static void main(String[] args) {

    // Using String (immutable)
    String greeting = "Interview";

    // Creates a new String object
    greeting = greeting + " Happy"; 

    // Using StringBuilder (mutable)
    StringBuilder sb = new StringBuilder("Interview");

    // Modifies the existing StringBuilder object
    sb.append(" Happy"); 

    System.out.println(greeting); // Interview  Happy
    System.out.println(sb.toString()); // Interview  Happy
  }
}
