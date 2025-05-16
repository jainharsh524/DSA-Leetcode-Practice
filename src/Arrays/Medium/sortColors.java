package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Q.75 https://leetcode.com/problems/sort-colors/
//Sol. https://leetcode.com/problems/sort-colors/solutions/6684245/easy-java-solution-3-pointers-approach-added-at-last-o-1-space-and-o-n-time-complexity/
public class sortColors {
    //# Approach
    //- Step 1: Count the frequency of 0s, 1s, and 2s.
    //- Step 2: Overwrite the array using the frequencies.
    public static void sortColors(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,0);
        mp.put(1,0);
        mp.put(2,0);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) mp.replace(0,mp.get(0)+1);
            else if(nums[i]==1) mp.replace(1,mp.get(1)+1);
            else mp.replace(2,mp.get(2)+1);
        }
        int index =0;
        while(mp.get(0)>0){
            nums[index]=0;
            index++;
            mp.replace(0,mp.get(0)-1);
        }
        while(mp.get(1)>0){
            nums[index]=1;
            index++;
            mp.replace(1,mp.get(1)-1);
        }
        while(mp.get(2)>0&&index<nums.length){
            nums[index]=2;
            index++;
            mp.replace(2,mp.get(2)-1);
        }
    }
    //# Complexity
    //Time Complexity: O(N)
    //Space Complexity: O(1)

    //## If you want truly inplace sorting then this question is a standard question aka '*Dutch National Flag*' Problem should be solved by (3-Pointer) Approach.
    //
    //# Intuition:
    //We maintain three pointers:
    //- low → the position for next 0
    //- mid → current element under consideration
    //- high → the position for next 2
    //
    //We scan the array and rearrange it in a single pass using these pointers.
    //
    //# Algorithm:
    //1. Initialize:
    //low = 0, mid = 0, high = nums.length - 1
    //2. While mid <= high:
    //    - If ```nums[mid] == 0:```
    //    ➝ ```swap nums[low] and nums[mid]```, increment both low and mid
    //    - If ```nums[mid] == 1```:
    //    ➝ ```just move mid forward```
    //    - If ```nums[mid] == 2:```
    //    ➝ ```swap nums[mid] and nums[high]```, decrement high (but don’t move mid!)
    //# Code for 3-pointer approach
    //```
    //public static void sortColors(int[] nums) {
    //    int low = 0, mid = 0, high = nums.length - 1;
    //
    //    while (mid <= high) {
    //        if (nums[mid] == 0) {
    //            // Swap with low, move both forward
    //            int temp = nums[low];
    //            nums[low] = nums[mid];
    //            nums[mid] = temp;
    //            low++;
    //            mid++;
    //        } else if (nums[mid] == 1) {
    //            // Move mid forward
    //            mid++;
    //        } else {
    //            // nums[mid] == 2
    //            // Swap with high, only move high backward
    //            int temp = nums[mid];
    //            nums[mid] = nums[high];
    //            nums[high] = temp;
    //            high--;
    //        }
    //    }
    //}
    //```
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
