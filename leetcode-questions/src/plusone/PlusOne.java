package plusone;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int count = digits.length;
        digits[digits.length-1]++;

        for(int i=0; i<digits.length; i++)
            System.out.print(digits[i] + "\t");
    }
}
