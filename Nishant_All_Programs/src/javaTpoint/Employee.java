package javaTpoint;

public class Employee {

	int id;
	String name;
	float sal;
	boolean b;
	
	public Employee(int e_id,String e_name,float e_sal,boolean e_b) {
	
		this.id=e_id;
		name=e_name;
		sal=e_sal;
		this.b=e_b;
		
		System.out.println("id :"+id +",name :"+name+" ,sal :"+sal +" ,b :"+b);//just check
		
	}
	
	public void info() {
	
		
		System.out.println("id :"+id +",name :"+name+" ,sal :"+sal +" ,b :"+b);
		
	}
	
	

	public static void main(String[] args) {
		
		Employee ee2 = new Employee(2, "kkc", 1254.5336537f,false);
		ee2.info();
		
		
		

	}

}
