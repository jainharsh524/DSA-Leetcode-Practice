package Sorting.Hard;
import java.util.Arrays;

//Q.41 https://leetcode.com/problems/first-missing-positive/description/
//# Intuition
//For this question I thought about the cyclic sort,
// because in cyclic sort we check that each element should be at its correct position
// which is equal to its value.
// From there I got the idea to arrange the elements at their correct position.
// And as soon as we hit an element with wrong value for its position
// we return the index+1 value as element for that index is missing from the array.
public class firstMissingPositive {
    //# Approach
    //1. Traverse the array:
    //    - For each element nums[i], check if it is in the valid range (1 to n)
    //    - If yes, and it's not in its correct position, swap it with the number at index nums[i] - 1
    //    - Repeat this process using a while loop until all valid numbers are placed correctly
    //
    //2. Second pass through the array:
    //    - For each index i, check if nums[i] == i + 1
    //    - If not, return i + 1 → this is the smallest missing positive number
    //
    //3. If all elements are in their correct places, return n + 1
    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static int firstMissingPositive(int[] nums) {
        for(int i =  0; i < nums.length; i++){
            while(nums[i] > 0 && nums[i] - 1 < nums.length && nums[i] - 1 != i && nums[nums[i]-1] != nums[i]){
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1!=i){
                return i+1;
            }
        }
        return nums.length+1;
    }
    //# Complexity
    //- Time complexity: O(N)
    //- Space complexity: O(1)
    public static void main(String[] args) {
        int[] nums = {3,-1,23,7,21,12,8,9,18,21,-1,16,1,13,-3,22,23,13,7,14,3,6,4,-3};
        System.out.println(firstMissingPositive(nums));
    }
}
