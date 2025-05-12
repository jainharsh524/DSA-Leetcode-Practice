package Sorting.Easy;

import java.util.*;

//Q.1331 https://leetcode.com/problems/rank-transform-of-an-array/description/
public class rankTransformOfAnArray {
    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }

        return arr;
    }
    public static void main(String[] args) {

    }
}
