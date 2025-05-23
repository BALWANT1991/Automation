package Overriding;

public class Main {

  public static void main(String[] args) {

    TemporaryEmp tEmp = new TemporaryEmp();
    tEmp.calculateSalary(); // call overrided method
    tEmp.officeTimings(); // call parent class method
    
    PermanentEmp pEmp=new PermanentEmp();
    pEmp.doFun(); // call class method
    pEmp.calculateSalary(); // call parent class method
    pEmp.officeTimings();// call overrided method
  }
}

