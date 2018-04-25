package org.launchcode;

public class Main {

	public static void main(String[] args) {
		String strs[] = {"abcde", "abdhkdf", "abghdi"};
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.findLongestCommonPrefix(strs));

	}
}























//		String strs[] = {"abcde", "abtghr", "abtuitt"};
//		String res = "";
//
//		for (int i = 0; i < strs[0].length(); i++) {
//			char c = strs[0].charAt(i);
//
//			for (int j = 1; j < strs.length; j++) {
//				if (strs[j].charAt(i) != c)
//
//				res = res + c;
//			}
//			System.out.println(res);
//		}
//	}
//}
