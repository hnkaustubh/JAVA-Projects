package stringmanipulations;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = s.next();
		String reverse ="";
		int count = str.length()-1;
		for(int i=count;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}
}
