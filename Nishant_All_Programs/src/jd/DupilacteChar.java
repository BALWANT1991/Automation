package jd;

public class DupilacteChar {

	public static void main(String[] args) {
		
		int count=0;
		String str= "nishankknt";
		char [] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					
					count++;
					System.out.println("this is Duplicate char :"+ch[j]);
					
				}
			}
		}
		System.out.println("how many Time repeated :"+count);

	}

}
