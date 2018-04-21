package stringmanipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DuplicateString{
	Scanner s = new Scanner(System.in);
	private int i,j;
	private String str;
	List l1 = new ArrayList();
	public DuplicateString(){
		System.out.println("Please enter a String");
		str = s.next();
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					l1.add(str.charAt(i));
				}
			}
		}
		System.out.println("Duplicate Characters in the String are - "+l1);
	}
}

public class StringDuplicate {
	public static void main(String[] args) {
		DuplicateString o = new DuplicateString();
	}
}
