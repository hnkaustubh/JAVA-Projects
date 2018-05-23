package happynumber;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = s.nextInt();

        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(n));
    }

    private boolean isHappy(int n) {
        if(n == 0)
            return false;
        else {
            Set<Integer> lookup = new HashSet<Integer>();
            while(n != 1) {
                if(lookup.contains(n))
                    return false;
                n = calSquareSum(n);
            }
        }
        return true;
    }

    private int calSquareSum(int n) {
        int sum = 0;

        while(n >1) {
            int digit = sum % 10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
        }
    }
}
