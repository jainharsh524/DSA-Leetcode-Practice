package Searching.Easy;

//Q.704 https://leetcode.com/problems/binary-search/description/
public class binarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(high>=low){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>=target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
