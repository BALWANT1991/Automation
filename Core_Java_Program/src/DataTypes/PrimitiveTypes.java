package DataTypes;

public class PrimitiveTypes {

  public static void main(String[] args) {
    // Integral types
    byte byteVar = 0; // 1 byte, range: -128 to 127
    short shortVar = 0; // 2 bytes, range: -32,768 to 32,767
    int intVar = 0; // 4 bytes, range: -2^31 to 2^31-1
    long longVar = 0L; // 8 bytes, range: -2^63 to 2^63-1

    // Floating-point types
    float floatVar = 0.0f; // 4 bytes, 
    double doubleVar = 0.0; // 8 bytes, 

    // Character type
    char charVar = 'a'; // 2 bytes

    // Boolean type
    boolean booleanVar = false; // 1 bit, true or false

    // Output default values
    System.out.println("Default values:");
    System.out.println("byte: " + byteVar);
    System.out.println("short: " + shortVar);
    System.out.println("int: " + intVar);
    System.out.println("long: " + longVar);
    System.out.println("float: " + floatVar);
    System.out.println("double: " + doubleVar);
    System.out.println("char: " + charVar);
    System.out.println("boolean: " + booleanVar);
  }
}
