package Arrays.Easy;

import java.util.Arrays;

//Q.26 https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class removeDuplicatesFromSortedArray {
    //# Approach
    //For this problem I kept the track of last unique element index.
    // Whenever I encountered the new unique element I swapped the element with the element next to old unique element.
    public static int[] swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
    public static int removeDuplicates(int[] nums) {
        int lastUniqueIndex = 0;
        for(int i = 1;i< nums.length;i++){
            if(nums[i] != nums[lastUniqueIndex]){
//                ++lastUniqueIndex;
                nums = swap(nums, i, lastUniqueIndex+1);
                lastUniqueIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return lastUniqueIndex+1;
        //# Complexity
        //- Time complexity: O(N)
        //- Space complexity: O(1)
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
