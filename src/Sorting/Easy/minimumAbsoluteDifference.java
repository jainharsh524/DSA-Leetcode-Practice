package Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q.1200 https://leetcode.com/problems/minimum-absolute-difference/
public class minimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> lst = new ArrayList<>();
        int minDifference = arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i]-arr[i-1];
            if(minDifference>Math.abs(diff)) minDifference = diff;
        }
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i]-arr[i-1];
            if(Math.abs(diff)==minDifference) {
                List<Integer> lst1 = new ArrayList<>();
                lst1.add(0,Math.min(arr[i], arr[i-1]));
                lst1.add(1,Math.max(arr[i], arr[i-1]));
                lst.add(lst1);
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
}
