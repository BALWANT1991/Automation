package java_Study;

public class Student {
	
	//private data member  
	
	
	
	private String name;  
	
	private int id;
	
	private int salary;
	
	public float tax;
	
	public String BusName;
	
	
	//getter method for name  
	
	
	public String getName(){  
	return name;  
	}  
	
	public int getEmpId() {
		return id;
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public float getTax() {
		return tax;
	}
	
	
	public String GetBusName() {
		return BusName;
	}
	//setter method for name  
	public void setName(String name){  
	this.name=name;
	} 
	
	//setter method for id  
	public void setId(int id){  
	this.id=id;
	} 
	
	public void  SetSalary(int salary) {
		this.salary=salary;
	}
	public void SetTax(float tax) {
		this.tax=tax;
	}
	
	public void SetBusName(String BusName) {
		this.BusName=BusName;
	}
	
}
