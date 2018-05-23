package reversewordsinstring;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Sky is blue";
        String[] schar = s.split(" ");

        for(int i=schar.length-1; i>=0; i--){
            System.out.println(schar[i]);
        }
    }
}
