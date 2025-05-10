package Sorting.Easy;

import java.util.Arrays;

//Q.922 https://leetcode.com/problems/sort-array-by-parity-ii/
public class sortArrayByParityII {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int i =0;
        int j =1;
        while (i< nums.length&&j< nums.length){
            if(nums[i]%2!=0&&nums[j]%2==0){
                swap(nums, i, j);
                i += 2;
                j+=2;
            }
            else if(nums[i]%2==0){
                i+=2;
            }
            else if (nums[j]%2!=0) {
                j+=2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6,1,5,4};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
}
