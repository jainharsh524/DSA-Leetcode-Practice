package Arrays.Easy;

import java.util.HashSet;

//Q.1832 https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class checkIfSentenceIsPangram{
//    # Another Approach
//In this approach I checked that string contains all the alphabets or not.
//But by this approach I was getting an error in this test
//case: "onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab"(75/79)
//    public boolean checkIfPangram(String sentence) {
//        for (char i = 'a'; i < 'z'; i++) {
//            String str = String.valueOf(i);
//            if(!sentence.contains(str)) return false;
//        }
//        return true;
//    }

    //# Approach
//I used hashmap for this question.
// In Hashmap hs, we add all the unique characters in the string.
// At last, we check whether length of the hashmap is 26 or not.
    public boolean checkIfPangram(String sentence) {
        HashSet <Character> hs = new HashSet<>();
        for (char i = 0; i < sentence.length(); i++) {
            if(!hs.contains(sentence.charAt(i))) hs.add(sentence.charAt(i));
        }
        return hs.size()==26;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(26) or O(1)
}
