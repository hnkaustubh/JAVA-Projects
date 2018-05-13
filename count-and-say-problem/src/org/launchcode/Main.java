package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder("1");
        System.out.println("Please enter the number n");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            char c = str.charAt(0);
            StringBuilder temp = new StringBuilder("");
            int counter = 1;
            for (int j=1; j<=str.length(); j++) {
                if(str.length() > 1){
                    if(str.charAt(j) != c){
                        temp.append(counter);
                        temp.append(str.charAt(j-1));
                        counter = 1;
                        c = str.charAt(j);
                    }
                    else{
                        counter++;
                        temp.append(counter);
                        temp.append(str.charAt(j));
                    }
                }
                else{
                    temp.append(counter);
                    temp.append(str.charAt(0));
                }
            }
            System.out.println(temp);
            str = temp;
        }
    }
}


























//    }
//	    String str = "1";
//	    Scanner s = new Scanner(System.in);
//        System.out.println("Please enter the Number n");
//        int n = s.nextInt();
//	    for(int i=2; i<=n; i++){
//	        char prev = str.charAt(0);
//	        StringBuilder temp = new StringBuilder();
//	        int counter = 1;
//	        for(int j=1; j<str.length(); j++){
//	            char ch = str.charAt(j);
//	            if(str.charAt(j) != prev){
//                    temp.append(counter);
//                    counter = 1;
//                    prev =ch;
//                }
//                else{
//	                counter++;
//                }
//                temp.append(counter);
//                temp.append(prev);
//	            str = temp.toString();
//            }
//            System.out.println(str);
//        }
//    }
//}
