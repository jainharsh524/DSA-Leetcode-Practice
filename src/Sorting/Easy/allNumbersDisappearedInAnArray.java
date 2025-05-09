package Sorting.Easy;

import java.util.ArrayList;
import java.util.List;

//Q.448 https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Sol. https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solutions/6727790/easy-java-solution-in-on-time-and-o1-spa-nzb6/
public class allNumbersDisappearedInAnArray {
    //Algorithm (Cyclic Sort based approach)
    //Initialize a pointer i = 0.
    //
    //Rearrange the elements so that each element nums[i] should ideally be placed at index nums[i] - 1:
    //
    //While i < nums.length:
    //If the value at nums[i] is not at the correct position (nums[i] - 1 != i) and
    //the target position (nums[nums[i] - 1]) does not already contain the same value (to avoid infinite swaps),
    //Then swap nums[i] with nums[nums[i] - 1].
    //Else, increment i.
    //Traverse the array after rearrangement:
    //
    //For every index j, if nums[j] != j + 1, then j + 1 is a missing number (because it’s not in the correct position).
    //Add all such missing numbers to the result list.
    //
    //Return the list containing all missing numbers in the range [1, n].
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i =0;
        while(i<nums.length) {
            if(nums[i]-1<nums.length&&nums[i]-1!=i&&nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j) list.add(j+1);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
