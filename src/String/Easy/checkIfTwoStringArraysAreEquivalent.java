package String.Easy;

//Q.1662 https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class checkIfTwoStringArraysAreEquivalent {
    public static String sum(String[] word1){
        String sum = "";
        for (int i = 0; i < word1.length; i++) {
            sum+=word1[i];
        }
        return sum;
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = sum(word1);
        String s2 = sum(word2);
        return s1.equals(s2);
    }
    public static void main(String[] args) {

    }
}
