package java_Study;

public class Test {
	
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
		Student s=new Student();  
		
		
		//setting value in the name member  
		
		
		s.setName("vijay");  
		s.setId(35);
		s.SetSalary(25000);
		s.SetTax(2055.543536f);
		s.SetBusName("RedBus");
		//getting value of the name member  
		
		System.out.println("This is Name :"+s.getName());  
		System.out.println("This is id :"+s.getEmpId());
		System.out.println("This is Salary :"+s.getSalary());
		System.out.println("This is Tax :"+s.getTax());
		System.out.println("This is BusName :"+s.GetBusName());
		
		}  
}
