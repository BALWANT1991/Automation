package AccessSpecifiers;

public class MathsStudent {

  public void GetStudent() {
    Student student = new Student();

   
    System.out.println(student.name);

    // Error: private not accessible
    System.out.println(student.age);
  }
}
