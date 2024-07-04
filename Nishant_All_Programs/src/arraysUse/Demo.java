package arraysUse;

import java.util.ArrayList;

public class Demo {
	public static void main(String [] args)
    {
         ArrayList<Student2> al= new ArrayList<Student2>();
  
         al.add(new Student2("Chaitanya", 26));
         al.add(new Student2("Ajeet", 25));
         al.add(new Student2("Steve", 55));
         al.add(new Student2("Mary", 18));
         al.add(new Student2("Dawn", 22));
         for (Student2 tmp: al){
             System.out.println(tmp);
         }
    }
}
