package Searching.Medium;

//Q.162 https://leetcode.com/problems/find-peak-element/
public class findPeakElement {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // you are in dec part of array
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {

    }
}
