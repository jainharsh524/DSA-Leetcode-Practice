package Sorting.Medium;

import java.util.ArrayList;
import java.util.List;

//Q.442 https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class findAllTheDuplicateInAnArray {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i =0;
        while(i<nums.length) {
            if(nums[i]-1<nums.length&&nums[i]-1!=i&&nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j) list.add(nums[j]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
    }
}
