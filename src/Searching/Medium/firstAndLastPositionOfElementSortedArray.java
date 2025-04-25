package Searching.Medium;


import java.util.Arrays;

//Q.34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class firstAndLastPositionOfElementSortedArray {
    //# Approach
    //Here’s the overall approach used in this code, explained in clear points:
    //
    //- 🔍 Step 1: Use Binary Search to Find One Occurrence of the Target
    //    - Call binarySearching(nums, target) — a classic binary search on the sorted array.
    //    - If the target is not found, return [-1, -1].
    //    - If it is found, store that index as currIndex.
    //
    //
    //- 🔁 Step 2: Expand Left to Find the First Occurrence
    //    - From currIndex, move left (first--) while elements are equal to target.
    //    - Stop when you reach the start of the array or a different element.
    //    - This gives the first index of the target.
    //
    //- 🔁 Step 3: Expand Right to Find the Last Occurrence
    //    - Similarly, move right (last++) while elements are equal to target.
    //    - Stop when you reach the end of the array or a different element.
    //    - This gives the last index of the target.
    static int binarySearching(int[] arr, int target){
        //for array sorted in ascending order only.
        int high = arr.length-1;
        int low = 0;
        while(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int currIndex = binarySearching(nums, target);
        if(currIndex==-1){
            arr[0] = -1;
            arr[1] = -1;
        }
        else {
            int first = currIndex, last = currIndex;
            while (first > 0) {
                if (nums[first - 1] == nums[currIndex]){
                    first--;
                    arr[0] = first;
                }
                else {
                    arr[0] = first;
                    break;
                }
            }
            if(last== nums.length-1){
                arr[1] = last;
            }
            else {
                while (last < nums.length - 1) {
                    if (nums[last + 1] == nums[currIndex]) {
                        last++;
                        arr[1] = last;
                    } else {
                        arr[1] = last;
                        break;
                    }
                }
            }
        }
        return arr;
    }
    //# Complexity
    //- Time complexity:O(logN)
    //- But for worst case where all the elements are same: O(N)
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(searchRange(nums, 3)));
    }
}

