package string_program;

public class String12 {
	public static void main(String[] args) {
        String s = "aaabdhhhssassa";
        String s2 = "J64446654ava8J";
	char[] c = s.toCharArray();
	int sz = c.length;
	int i = 0;
	String alphanumericalstring = "";
	int j = 0;
	int counter = 0;
	for (i = 0; i < sz; i++) {
	counter = 0;
	for (j = 0; j < sz; j++) {
	if (j < i && c[i] == c[j]) {
	break;
	}
	if (c[j] == c[i]) {
	counter++;
     	}
	if (j == sz - 1) {

	String value = Integer.toString(counter);
	String modifiedstring = c[i] + value;
	alphanumericalstring = alphanumericalstring + modifiedstring;
	}}}
	System.out.println(alphanumericalstring);
	}}



