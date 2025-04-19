package Arrays.Easy;

import java.util.Arrays;

//Q.1920 https://leetcode.com/problems/build-array-from-permutation/description/
public class buildArrayWithPermutation {
    public static  int[] buildArray(int[] nums) {
        int[] num1 = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int temp = nums[i];
            num1[i] = nums[nums[i]];
        }
        return num1;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
