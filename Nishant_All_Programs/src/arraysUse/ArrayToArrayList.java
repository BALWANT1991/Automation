package arraysUse;
import java.util.*;
public class ArrayToArrayList {
	public static void main(String[] args) {

		  /* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal","Pune"};
		  
		  ArrayList<String> al = new ArrayList<String>(Arrays.asList(citynames));
		  al.add("Nanded");
		  al.add("Aurangabad");
		  System.out.println("Convert to array to arrayList ::::::::::::::");
		  
		  for(String temp : al) {
			  System.out.println(temp);
		  }

}
}