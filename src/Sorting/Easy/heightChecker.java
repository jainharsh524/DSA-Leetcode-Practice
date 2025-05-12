package Sorting.Easy;
import java.util.*;

//Q.1051 https://leetcode.com/problems/height-checker/description/
public class heightChecker {
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] sorted =  Arrays.copyOf(heights, n);
        int count = 0;
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            if(sorted[i] != heights[i]) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
