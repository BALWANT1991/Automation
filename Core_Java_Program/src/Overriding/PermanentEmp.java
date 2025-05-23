package Overriding;

public class PermanentEmp extends Employee {
    public void doFun() {
        System.out.println("Do Fun"); 
    }
    @Override
    public void officeTimings() {
        System.out.println("11.30am-7.0pm");
    }
}

