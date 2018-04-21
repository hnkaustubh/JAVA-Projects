package stringmanipulations;

public class StringCharacterOccurence {

	public static void main(String[] args) {
		String str = "polymorphism";
		char c = 'p';
		int count1,count2,countChar;
		count1=str.length();
		count2=str.replace("p", "").length();
		countChar = count1-count2;
		System.out.println(countChar);
	}
}
