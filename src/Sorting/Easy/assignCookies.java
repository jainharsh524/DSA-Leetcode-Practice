package Sorting.Easy;
import java.util.*;

//Q.455 https://leetcode.com/problems/assign-cookies/description/
public class assignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        int cookiesNums = s.length;
        if(cookiesNums == 0)  return 0;
        Arrays.sort(g);//first sort both of them
        Arrays.sort(s);
        int maxNum = 0;
        int cookieIndex = cookiesNums - 1;
        int childIndex = g.length - 1;//iterate from back and check the satisfaction of max element first.
        while(cookieIndex >= 0 && childIndex >=0){
            if(s[cookieIndex] >= g[childIndex]){
                maxNum++;
                cookieIndex--;
            }
            childIndex--;
        }
        return maxNum;
    }
    public static void main(String[] args) {

    }
}
