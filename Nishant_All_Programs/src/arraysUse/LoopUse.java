package arraysUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopUse {

	public static void main(String[] args) {
		 List<String> tvShows = new ArrayList<>();
	        tvShows.add("Breaking Bad");
	        tvShows.add("Game Of Thrones");
	        tvShows.add("Friends");
	        tvShows.add("tarak maheta");
	        tvShows.add("DNA");

	        //for each loop
	        System.out.println("=== Iterate using Java 8 forEach and lambda ==="); 
	    
	        tvShows.forEach(tvShow ->{
	        	System.out.println(tvShow);
	        });
	        
	        
	        //while loop
	        System.out.println("\n=== Iterate using an while loop ===");
	        
	        Iterator<String>itr=tvShows.iterator();
	        while(itr.hasNext()) {
	        	String allTvshow=itr.next();
	        	System.out.println(allTvshow);
	        }
	        
	        //smart for loop
	        System.out.println("\n=== Iterate using an smart for loop ===");
	        
	        for(String show:tvShows) {
	        	System.out.println(show);
	        }
	        
	        System.out.println("\n=== Iterate using for loop with index ===");
	        
	        for(int i = 0; i < tvShows.size(); i++) {
	            System.out.println(tvShows.get(i));
	        
	}

}}
