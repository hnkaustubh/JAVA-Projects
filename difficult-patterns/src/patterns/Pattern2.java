package patterns;
import java.util.*;

class Pattern{
	public Scanner s= new Scanner(System.in);
	public Pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(6-i);j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print("\t");
			}
		System.out.println("");
		}
	}

}

public class Pattern2 {
	public static void main(String[] args) {
		Pattern o = new Pattern();
	}
}
