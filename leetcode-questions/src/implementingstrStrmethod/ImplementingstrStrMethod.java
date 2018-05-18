package implementingstrStrmethod;

public class ImplementingstrStrMethod {

    public static void main(String[] args) {
        String haystack = "listen";
        String needle = "the";

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        char firstNeedle = needleArray[0];

        for(int i=0; i<haystackArray.length; i++) {
            if (haystackArray[i] == firstNeedle) {
                for (int j = 1; j < needleArray.length; j++) {
                    if (needleArray[j] == haystackArray[i + 1]) {
                        i++;
                        continue;
                    }
                }
            }
        }
    }
}
