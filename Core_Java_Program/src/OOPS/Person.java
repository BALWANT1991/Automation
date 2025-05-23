package OOPS;

public class Person {

  private int age; // Field

  public int getAge() { // Getter method for age
    return age * 2;
  }

  public void setAge(int age) { // Setter method for age
    if (age < 0) { // Validate age (must be positive)
      System.out.println("Incorrect Age");
      return;
    }
    this.age = age;
  }

  public static void main(String[] args) {
    Person person = new Person();
        //person.age = 10;
    person.setAge(35); // Modifying age using setter method

    System.out.println(person.getAge()); // Output: 70
  }
}
