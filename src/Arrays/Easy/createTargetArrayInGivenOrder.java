package Arrays.Easy;

import java.util.ArrayList;

//Q.1389 https://leetcode.com/problems/create-target-array-in-the-given-order/
public class createTargetArrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] nums1 = new int[nums.length];
        for(int i =0;i< nums.length;i++){
            nums1[i] = list.get(i);
        }
        return nums1;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(N)
    public static void main(String[] args) {

    }
}
