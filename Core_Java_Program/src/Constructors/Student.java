package Constructors;

public class Student {

  private String name;

  // Parameterized Constructor
  public Student(String name) {
    this.name = name;
  }

  // Copy constructor
  public Student(Student other) {
    this.name = other.name; // Copy name from the other object
  }

  // Getter method for name
  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    Student stu1 = new Student("Happy");

    // Create another student object 
    // as a copy of student1
    Student stu2 = new Student(stu1);

    System.out.println(stu1.getName()); 
    System.out.println(stu2.getName()); 
  }
}
// Output: Happy Happy
