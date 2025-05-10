package Sorting.Easy;

import java.util.Arrays;

//Q.628 https://leetcode.com/problems/maximum-product-of-three-numbers/description/
public class maximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int lastIndex = nums.length-1;
        int max1 = nums[lastIndex];
        int max2 = nums[lastIndex-1];
        int max3 = nums[lastIndex-2];
        int min1 = nums[0];
        int min2 = nums[1];
        return Math.max(max2*max1*max3, min1*min2*max1);
    }
    public static void main(String[] args) {

    }
}
