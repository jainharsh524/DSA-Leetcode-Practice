package String.Easy;

//Q.1768 https://leetcode.com/problems/merge-strings-alternately/description/
public class mergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        int i =0;
        while(i<word1.length()&&i<word2.length()){
            mergedString = mergedString+word1.charAt(i)+word2.charAt(i);
            i++;
        }
        if(word1.length()<word2.length()){
            while(i<word2.length()){
                mergedString = mergedString+word2.charAt(i);
                i++;
            }
        }
        else if (word1.length() > word2.length()) {
            while(i<word1.length()){
                mergedString = mergedString+word1.charAt(i);
                i++;
            }
        }
        return mergedString;
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("Harsh", "Ullashhh"));
    }
}
