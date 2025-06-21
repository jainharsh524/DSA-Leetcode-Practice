package String.Medium;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//Q.3085 https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/description/?envType=daily-question&envId=2025-06-21
//Sol. https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/solutions/6868636/easy-java-solution-using-greedy-and-hash-6la9/
public class minimumDeletionsToMakeStringKSpecial {
    public static int minimumDeletions(String word, int k) {
        int countMin = word.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if(!freq.containsKey(word.charAt(i))) freq.put(word.charAt(i), 1);
            else {
                int value = freq.get(word.charAt(i));
                freq.replace(word.charAt(i), value, value+1);
            }
        }
        for (Integer value : freq.values()) {
            int countDel = 0;
            for (Integer val : freq.values()) {
                if(value>val) countDel = countDel+val;
                else if(value+k<val){
                    countDel = countDel+val-value-k;
                }
            }
            if(countDel<countMin) countMin = countDel;
        }
        return countMin;
    }
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aabcaba", 0));
    }
}
