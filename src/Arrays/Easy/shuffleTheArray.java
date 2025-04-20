package Arrays.Easy;

import java.util.Arrays;

//Q.1470 https://leetcode.com/problems/shuffle-the-array/description/
public class shuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] nums1 = new int[2*n];
        for(int i=0;i< n;i++){
            nums1[2*i] = nums[i];
        }
        for(int j = 0; j < n; j++){
            nums1[(2*j)+1] = nums[j+n];
        }
        return nums1;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(N)
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
