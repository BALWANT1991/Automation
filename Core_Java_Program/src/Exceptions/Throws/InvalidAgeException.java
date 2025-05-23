package Exceptions.Throws;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {

  public InvalidAgeException(String message) {
    super(message);
    if (message == "Age cant be -ve") {
      System.err.println("Custom Exception 1");
    } else if (message == "Age cant be zero") {
      System.err.println("Custom Exception 2");
    }
  }
}
