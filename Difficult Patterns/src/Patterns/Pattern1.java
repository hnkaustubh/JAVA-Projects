package Patterns;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many rows of the pattern do you want?");
		int n = s.nextInt();
		int num = 1;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}

}
