package stringmanipulations;

import java.util.Arrays;
import java.util.Scanner;

class AnagramString{
	public boolean CheckAnagram(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		else {
			s1 = s1.toUpperCase();
			s2 = s2.toUpperCase();
			char[] s1char = s1.toCharArray();
			char[] s2char = s2.toCharArray();
			Arrays.sort(s1char);
			Arrays.sort(s2char);
			return Arrays.equals(s1char, s2char);
		}
	}
}

public class StringAnagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the First String");
		String str1 = s.next();
		System.out.println("Please enter the Second String");
		String str2 = s.next();
		
		AnagramString o = new AnagramString();
		
		if(o.CheckAnagram(str1, str2) == true) {
			System.out.println("Both the Strings are Anagrams");
		}
		else
			System.out.println("These Strings are not Anagrams");
	}
}
