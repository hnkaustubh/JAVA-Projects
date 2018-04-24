package letterCombinations;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> letterCombinations(String digits){
        String[] phone = {",","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res = new ArrayList<String>();
        String s = "";
        helper(res,s,phone,digits);
        return res;
    }

    void helper(ArrayList<String> res, String s, String[] phone, String digits){
        if(digits.length() == 0){
            res.add(s);
            return;
        }
        for(int i=0; i<phone[digits.charAt(0)-'0'].length(); i++){
            s = s+phone[digits.charAt(0)-'0'].charAt(i);
            helper(res,s,phone,digits.substring(1));
            s = s.substring(0,s.length()-1);
        }
    }
}
