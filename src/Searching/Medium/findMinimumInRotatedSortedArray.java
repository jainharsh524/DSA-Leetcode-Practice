package Searching.Medium;

//Q.153 https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//Sol. https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solutions/6705358/easy-java-solution-beats-100-using-binar-fdlv/
public class findMinimumInRotatedSortedArray {
    //Intuition
    //Just find the peak element index in the rotated array. Minimum element will be next to the peak element.
    //
    //Algorithm in Points
    //findPeak(nums) – Find the Peak Element
    //Initialize low = 0 and high = nums.length - 1.
    //Run a binary search loop: while (low < high)
    //Compute mid = low + (high - low) / 2
    //Check:
    //If nums[mid] > nums[mid+1] → mid is the peak (return mid).
    //If nums[mid-1] > nums[mid] → mid-1 is the peak (return mid-1).
    //Decide search direction:
    //If nums[mid] >= nums[low], the left half is sorted → move right: low = mid + 1.
    //Else move left: high = mid - 1.
    //findMin(nums)
    //Use the findPeak() function to locate the pivot (i.e., the largest element).
    //Return the next element: nums[(peakIndex + 1) % nums.length] → this is the smallest element.
    public static int findPeak(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(mid<high&&nums[mid]>nums[mid+1]) return mid;
            else if(mid>low&&nums[mid-1]>nums[mid]) return mid-1;
            else if(nums[mid]>=nums[low]) low = mid+1;
            else if(nums[mid]<nums[low]) high = mid-1;
        }
        return low;
    }
    public static int findMin(int[] nums) {
        int peakIndex = findPeak(nums);
        return nums[(peakIndex+1)%nums.length];
    }
    //Complexity
    //Time complexity: O(logN)


    //# Another Optimized Code
//    public static int findMin(int[] nums) {
//        int low = 0, high = nums.length - 1;
//        while (low < high) {
//            int mid = low + (high - low) / 2;
//            if (nums[mid] > nums[high]) {
//                // Min is in the right half
//                low = mid + 1;
//            } else {
//                // Min is in the left half including mid
//                high = mid;
//            }
//        }
//        return nums[low]; // or nums[high], both are same here
//    }
    public static void main(String[] args) {
        int[] nums = {9,0,1,2};
        System.out.println(findPeak(nums));
    }
}
