package arraysUse;

import java.util.ArrayList;
import java.util.List;

public class SimInfo {

	public static void main(String[] args) {
		List<SimCard> sim = new ArrayList<SimCard>();
		
		sim.add(new SimCard("Jio",1,"Pune"));
		sim.add(new SimCard("Aitel",2,"Nanded"));
		sim.add(new SimCard("IDEA",3,"Mumbai"));
		sim.add(new SimCard("Vodafone",4,"Nagpur"));
		
		for(SimCard i:sim) {
			System.out.println("Sim Name :"+i.simName+"sim no :"+i.simNumber+" Sim City :"+i.cSity);
		}

	}

}
