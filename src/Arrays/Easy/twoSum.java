package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Q.1 https://leetcode.com/problems/two-sum/
public class twoSum {
    //Brute Force
//    public int[] twoSum(int[] nums, int target) {
//        ArrayList <Integer> arr = new ArrayList<>();
//        int[] array = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]+nums[j]==target){
//                    arr.add(i);
//                    arr.add(j);
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < arr.size(); i++) {
//            array[i] = arr.get(i);
//        }
//        return array;
//    }
    //Another method but time complexity is almost equal to brute force.
//    public static int Search(int[] arr, int target){
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==target) return i;
//        }
//        return -1;
//    }
//    public int[] twoSum(int[] nums, int target) {
//        int[] array = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int element = nums[i];
//            int newTarget = target-element;
//            int index = Search(nums, newTarget);
//            if(index!=-1) {
//                array[0] = i;
//                array[1] = index;
//            }
//        }
//        return array;
//    }
    //# Approach
    //In this question I used a hashmap to reduce the search time because it searches in constant time, Otherwise we could have used just the array but that would give us the complexity of N*N.
    //
    //# Complexity
    //- Time complexity: O(N)
    //- Space complexity: O(N)
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int newTarget = target-element;
            if(hm.containsKey(newTarget)){
                int index = hm.get(newTarget);
                array[0] = i;
                array[1] = index;
            }
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
