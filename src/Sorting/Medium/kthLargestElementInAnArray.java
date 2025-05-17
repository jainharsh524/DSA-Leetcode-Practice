package Sorting.Medium;

import java.util.*;

//Q.215 https://leetcode.com/problems/kth-largest-element-in-an-array/
public class kthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 4));
    }
}
