package String.Easy;

import java.util.ArrayList;
import java.util.List;

//Q.2942 https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24
public class findWordsContainingCharacters {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        String y = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(y)) lst.add(i);
        }
        return lst;
    }
    public static void main(String[] args) {

    }
}
