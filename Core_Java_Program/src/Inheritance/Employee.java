package Inheritance;

// Inheritance example
// Employee class (parent/ base/ super)
public class Employee {

	private int exp;

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public double calculateSalary() {
		int salary = exp * 50000;
		return salary;
	}
}
