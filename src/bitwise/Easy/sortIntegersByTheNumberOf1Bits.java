package bitwise.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//Q.1356 https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/
//Unsolved
public class sortIntegersByTheNumberOf1Bits {
    public int hammingWeight(int num) {
        int count = 0;
        while (num>0){
            int end = num&1;
            if(end==1) count++;
            num = num>>1;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        ArrayList[] buckets= new ArrayList[14];
        for (int i = 0; i < arr.length; i++) {
            int setBits = hammingWeight(arr[i]);
            buckets[setBits].add(arr[i]);
        }
        for (int i = 0; i < 14; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index] = (int) buckets[i].get(j);
            }
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
