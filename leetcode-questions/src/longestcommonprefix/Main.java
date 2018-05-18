package longestcommonprefix;

public class Main {
    public static void main(String[] args) {
        String strs[] = {"abcde", "abdhkdf", "abghdi"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.findLongestCommonPrefix(strs));
    }
}
