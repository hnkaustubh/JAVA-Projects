package patterns;
import java.util.*;

class StarPattern{
	private int i,j,k,n;
	public Scanner s = new Scanner(System.in);
	StarPattern(){
//		System.out.println("How many rows of the Pattern do you want?");
//		n = s.nextInt();
		
			for(i=1;i<=7;i++) {
				for(j=1;j<=i;j++) {
					System.out.print("*");
					System.out.print("\t");
				}
				for(k=1;k<=(14-(2*i));k++) {
					System.out.print("\t");
				}
				for(j=1;j<=i;j++) {
					System.out.print("*");
					System.out.print("\t");
				}
				System.out.println("");
			}
		
			System.out.println("");

			for(i=1;i<=7;i++) {
				for(j=1;j<=(8-i);j++) {
					System.out.print("*");
					System.out.print("\t");
				}
				for(k=1;k<=((2*i)-2);k++) {
					System.out.print("\t");
				}
				for(j=1;j<=(8-i);j++) {
					System.out.print("*");
					System.out.print("\t");
				}
			System.out.println("");
			}
		}
	}


public class Pattern3 {

	public static void main(String[] args) {
		StarPattern o = new StarPattern();

	}

}
