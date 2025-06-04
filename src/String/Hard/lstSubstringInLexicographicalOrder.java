package String.Hard;

import java.util.Arrays;

//Q.1163 https://leetcode.com/problems/last-substring-in-lexicographical-order/description/
//unsolved
public class lstSubstringInLexicographicalOrder {
    public static String lastSubstring(String s) {
        String[] charArray = s.split("");
        System.out.println(Arrays.toString(charArray));
        for (int i = s.length()-2; i >= 0; i--) {
            charArray[i] = charArray[i]+charArray[i+1];
        }
        Arrays.sort(charArray);
        return charArray[s.length()-1];
    }
    public static void main(String[] args) {
        System.out.println(lastSubstring("abab"));
    }
}
