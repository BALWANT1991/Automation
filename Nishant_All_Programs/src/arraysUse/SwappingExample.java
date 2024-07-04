package arraysUse;
import java.util.*;
public class SwappingExample {

	public static void main(String[] args) {

		
		List<String> swap = new ArrayList<String>();
		swap.add("RCB");
		swap.add("CSK");
		swap.add("MI");
		swap.add("DC");
		swap.add("SRH");
		swap.add("KKR");
		
		System.out.println("Before Swapping ::::::::");
		for(String team:swap) {
			System.out.println(team);
		}
		
		Collections.swap(swap, 1, 5);
		
		System.out.println("After Swapping :::::::::");
		for(String team:swap) {
			System.out.println(team);
		}
		

	}

}
