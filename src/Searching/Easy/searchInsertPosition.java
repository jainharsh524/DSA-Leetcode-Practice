package Searching.Easy;

//Q.35 https://leetcode.com/problems/search-insert-position/
//Sol. https://leetcode.com/problems/search-insert-position/solutions/6698327/easy-java-solution-beats-100-using-binar-a6u5/
public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]) return nums.length;
        else {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            return low;
        }
    }
    public static void main(String[] args) {

    }
}
