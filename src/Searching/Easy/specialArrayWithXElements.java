package Searching.Easy;

import java.util.Arrays;

public class specialArrayWithXElements {
    public static int ceil(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(high>=low){
            int mid = low+(high-low)/2;
//            if(arr[mid]==target) return mid;
            if(arr[mid]>=target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums[nums.length-1]; i++) {
            int index = ceil(nums, i);
            if(index!=-1){
                if(nums.length-index==i) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        Arrays.sort(arr);
        System.out.println(arr.length);
        System.out.println(ceil(arr, 100));
    }
}
