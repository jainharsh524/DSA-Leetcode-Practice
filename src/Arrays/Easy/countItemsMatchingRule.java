package Arrays.Easy;

import java.util.*;

//Q.1773 https://leetcode.com/problems/count-items-matching-a-rule/
public class countItemsMatchingRule {
//    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int a=0;
//        if(ruleKey=="type") a = 0;
//        if(ruleKey=="color") a = 1;
//        if(ruleKey=="name") a = 2;
//        int count = 0;
//        for (int i = 0; i < items.size(); i++) {
//            if(items.get(i).get(a) ==ruleValue) count++;
//        }
//        return count;
//    } In string comparison use .equals() method instead of ==.
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int i = 0;
            int count = 0;
            if(ruleKey.equals("color")) i=1;
            else if(ruleKey.equals("name")) i=2;

            for(List<String> item : items){
                if(item.get(i).equals(ruleValue)){
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {

    }
}
