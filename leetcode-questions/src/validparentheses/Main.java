package validparentheses;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Input Stream");
        String str = s.nextLine();
        ValidParentheses cv = new ValidParentheses();
        System.out.println(cv.isValid(str));
    }
}
