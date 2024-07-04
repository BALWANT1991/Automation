package javaExample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Check {
	
	public static void main(String arg[]) throws ParseException
	 
	{
	 
	DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	 
	Date date=dateFormat.parse("13/02/2019 10:02:11");
	 
	System.out.println(date); 
	 
	}
}
