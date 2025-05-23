package AccessSpecifiers;

public class ScienceStudent {

  public void GetStudent() {
    Student student = new Student();
    System.out.println(student.name); // public: no error

    System.out.println(student.city); // private: error

    System.out.println(student.age); // default: no error
  }
}
