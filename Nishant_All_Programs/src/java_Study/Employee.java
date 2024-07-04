package java_Study;

public class Employee {

	
	int id;
	String Name;
	double Tax;
	
	
	private Employee(int id,String name,double tax) {
		this.id=id;
		this.Name=name;
		this.Tax=tax;
	}
	
	void Emp_Info() {
		System.out.println(" id  :"+id +" name "+Name +" Tax"+Tax);
	}
	
	public static void main(String [] args) {
		Employee ee = new Employee(12,"Nishant",23.12d);
		ee.Emp_Info();
	}
}
