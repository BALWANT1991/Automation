package Polymorphism;

public class DifferentReturnType {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b) {
        return a + b;
    }
    
    // Compile time error: Duplicate methods

}

