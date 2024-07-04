// WAP to count the number of occurrence of characters in a String:

package string_program;

import java.util.HashMap;

public class String8 {
			

		//Alternative approach using HashMap
			
		public static void main(String[] args) {
				String s = "abcdefabcdefaabb";
				
				HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
				
				for (int i=0; i<s.length(); i++)
				{
					
					char charvalue = s.charAt(i);//a
					
					if(hm.containsKey(charvalue))
					{
						hm.put(charvalue, hm.get(charvalue)+1);
					}
					else
					{
						hm.put(charvalue, 1);
						
					}
				}
				
				System.out.println(hm);
				
				
			}





}
