package String.Medium;

import java.util.ArrayList;
import java.util.List;

//Q.1324 https://leetcode.com/problems/print-words-vertically/description/
public class printWordsVertically {
    public static List<String> printVertically(String s) {
        List<String> lst = new ArrayList<>();
        String[] strArray = s.split(" ");
        int maxLength = 0;
        for (String value : strArray) {
            if (value.length() > maxLength) {
                maxLength = value.length();
            }
        }
        int ptr = 0;
        while (ptr<maxLength){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArray.length; i++) {
                if(ptr<strArray[i].length()){
                    sb = sb.append(strArray[i].charAt(ptr));
                }
                else {
                    sb = sb.append(" ");
                }
            }
            String sn = sb.toString().stripTrailing();
            lst.add(sn);
            ptr++;
        }
        return lst;
    }
    public static void main(String[] args) {

    }
}
