package javaExample;

public class ConS1Use {
	
	int eid;
	String eName;
	int sal;
	String City;
	float tax;
	
	//By default constructor
	
	public ConS1Use() {
		this.eid=101;
		this.eName="Nishant";
		this.sal=100000;
		this.City="Nanded";
	//	this.tax=1020.323f;
	}
	
	
	// this parameterized Constructor
	public ConS1Use(int id,String name,int salr,String citys,float TAX) {
		this.eid=id;
		this.eName=name;
		this.sal=salr;
		this.City=citys;
		this.tax=TAX;
	}
	
	
	
	public static void main(String[] args) {
	
		ConS1Use co = new ConS1Use();
		System.out.println(co.eid+" "+co.eName+" "+co.sal+" "+co.City+" "+co.tax);
		ConS1Use pco = new ConS1Use(001,"KKC",100005,"Nanded",21.53f);
		System.out.println("id:"+pco.eid+" Name :"+pco.eName+" Sal : "+pco.sal+" City:"+pco.City+" TAX :"+pco.tax);
		
	}

}
