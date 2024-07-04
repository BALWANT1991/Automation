package arraysUse;

public class SimCard {
	String simName;
	int simNumber;
	String cSity;
	
	
	SimCard(String simName,int simNumber,String cSity){
		this.simName=simName;
		this.simNumber=simNumber;
		this.cSity=cSity;
	}
	
	// first getter
	
	public String getsimName() {
		
		return simName;
	}
	
	// second-setter
	
	public void setsimName(String simName) {
		this.simName=simName;
	}
	
public int simNumber() {
		
		return simNumber;
	}
	
public void simNumber(int simNumber) {
	this.simNumber=simNumber;
}
	

public String cSity() {
	return cSity;
}

public void cSity(String cSity) {
	this.cSity=cSity;
}
	
}
