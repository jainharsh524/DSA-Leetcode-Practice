package Searching.Medium;

//Q.33 https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class searchInRotatedArray {
    //Approach
    //Find the pivot(Point of rotation of array/max element in array)
    //Search in First half if found then return the value else search in second half using simple binary search.
    //Working of function pivotIndex
    //Check if mid is pivot:
    //
    //If mid < high and nums[mid] > nums[mid + 1],
    //→ mid is the pivot, because it’s bigger than the next element.
    //
    //If mid > low and nums[mid] < nums[mid - 1],
    //→ mid - 1 is the pivot, because previous element is greater than current.
    //
    //Narrow down search:
    //
    //If nums[mid] <= nums[low], it means pivot lies on the left side.So set high = mid - 1
    //
    //Otherwise, pivot lies on the right side.
    //So set low = mid + 1
    public static int pivotIndex(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(high>=low){
            int mid = low+(high-low)/2;
            if(mid<high && nums[mid]>nums[mid+1]) return mid;
            if(mid>low && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid]<=nums[low]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target, int low, int high){
        while(high>=low){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int pivot = pivotIndex(nums);
        System.out.println(pivot);
        int index = binarySearch(nums, target, 0, pivot);
        if(index==-1){
            index = binarySearch(nums, target, pivot+1, nums.length-1);
        }
        return index;
    }
    //Complexity
    //Time complexity:O(logN)
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        System.out.println(search(arr, 8));
    }
}
