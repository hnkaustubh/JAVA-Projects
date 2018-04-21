package stringmanipulations;

import java.util.Scanner;

public class StringDuplicateDelete {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		System.out.println("Please enter the String");
		str.append(s.next());
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					str.deleteCharAt(j);
				}
			}
		}
		System.out.println("Final String without Duplicate Characters: - "+str);
	}
}
