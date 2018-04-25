package org.launchcode;

public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs){
        String res = "";

        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i) != c)
                    return res;
            }
            res = res + c;
        }
        return res;
    }
}
