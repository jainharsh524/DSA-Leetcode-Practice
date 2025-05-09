package Sorting.Easy;

import java.util.Arrays;

//Q.217 https://leetcode.com/problems/contains-duplicate/description/
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
