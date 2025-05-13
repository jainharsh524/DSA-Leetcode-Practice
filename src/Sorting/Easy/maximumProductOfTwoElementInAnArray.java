package Sorting.Easy;

import java.util.Arrays;

//Q.1464 https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class maximumProductOfTwoElementInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length-1;
        return (nums[last]-1)*(nums[last-1]-1);
    }
    public static void main(String[] args) {

    }
}
