package org.launchcode;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Input Stream");
        String str = s.nextLine();
        CheckValid cv = new CheckValid();
        System.out.println(cv.isValid(str));
    }
}
