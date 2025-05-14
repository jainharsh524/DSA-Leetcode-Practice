package Sorting.Easy;

import java.util.*;

//Q.1636 https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
public class sortArrayByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            return map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b);
        });
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) {
                nums[i++] = num;
            }
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
