package arraysUse;

import java.util.*;

public class ArrayListUserDefinedObjectExample {

	public static void main(String[] args) {

		 List<User> users = new ArrayList<>();
		 
		 users.add(new User("kkc",26));
		 users.add(new User("nishant",25));
		 users.add(new User("virat",28));
		 users.add(new User("Abhi",32));

		 for(User i :users) {
			 System.out.println("Name of Student "+i.getName()+"  & Age is : "+i.getid());
		 }
	}
	
	

}
