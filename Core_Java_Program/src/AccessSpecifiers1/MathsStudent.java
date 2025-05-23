package AccessSpecifiers1;

import AccessSpecifiers.Student;

public class MathsStudent {

  public void GetStudent() {
    Student student = new Student();

    System.out.println(student.name); // public: no error

    System.out.println(student.city); // private: error
    
    System.out.println(student.age); // default: error
  }
}
