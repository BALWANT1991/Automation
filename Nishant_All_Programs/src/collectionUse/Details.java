package collectionUse;

import java.util.ArrayList;
import java.util.Collections;

public class Details {
	public static void main(String args[]){
		   ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
		   Collections.sort(listofcountries);

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   
		   // after sorting add other element
		   
		   listofcountries.add("Dubai");
		   listofcountries.add("newyork");
		   
		   
		   System.out.println("List after sorting add 2 element");
		   for(String str:listofcountries) {
			   System.out.println(str);
		   }
		}
}
