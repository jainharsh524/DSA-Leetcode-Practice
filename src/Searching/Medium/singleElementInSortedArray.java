package Searching.Medium;

//Q.540 https://leetcode.com/problems/single-element-in-a-sorted-array/
//Sol. https://leetcode.com/problems/single-element-in-a-sorted-array/solutions/6704997/easy-java-solution-using-binary-search-b-gd51/
public class singleElementInSortedArray {
    //Algorithm in Points
    //1. Binary Search for Target:
    //binarySearching(nums, target) performs standard binary search to return the index of the target in the sorted array.
    //2. Find Start and End Indices of Target:
    //searchRange(nums, target):
    //Uses the binary search result.
    //Checks the previous and next values to determine the first and last occurrence of the target.
    //Assumes the target appears at most twice.
    //3. Main Function – singleNonDuplicate(nums)
    //Performs binary search over the full array to find the single element.
    //At each step:
    //Uses searchRange to get first and last index of nums[mid].
    //If first == last, the element is unique — return it.
    //Else, decide the side to search next:
    //If the count of elements to the left of the pair is odd (first % 2 == 1), search the left half.
    //Else if the count of elements to the right is odd ((n - last - 1) % 2 == 1), search the right half.
    //4. Return -1 if not found — although per constraints, the unique element always exists.
    //Note:
    //You can also remove the binarySearching function because you can directly give the index of the element to the searchRange Function.
    static int binarySearching(int[] arr, int target){
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
            if(first==0) arr[0] = first;
            else {
                if (nums[first - 1] == nums[currIndex]) arr[0] = first - 1;
                else arr[0] = first;
            }
            if(last== nums.length-1) arr[1] = last;
            else {
                if (nums[last + 1] == nums[currIndex]) arr[1] = last+1;
                else arr[1] = last;
            }
        }
        return arr;
    }
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(high>=low){
            int mid = low+(high-low)/2;
            int[] positionsArray = searchRange(nums, nums[mid]);
            if(positionsArray[0]==positionsArray[1]){
                return nums[mid];
            }
            else{
                if(positionsArray[0]%2==1) high = mid-1;
                else if((nums.length-positionsArray[1]-1)%2==1) low = mid+1;
            }
        }
        return -1;
    }
    //Complexity
    //Time complexity: O(logN)
    //Space complexity: O(1)
    public static void main(String[] args) {

    }
}
