package Arrays.Easy;

import java.util.Arrays;

//Q.1365 https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class smallerNumberThanCurrentNumber {
    //brute force
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] nums1 = new int[nums.length];
//        for(int i =0;i< nums.length;i++){
//            for(int j =0;j< nums.length;j++){
//                if(nums[i]>nums[j]){
//                    nums1[i]+=1;
//                }
//            }
//        }
//        return nums1;
//    }
    //# Complexity
    //- Time complexity:O(N*N)

    //# Approach
    //This method of counting the frequency of array elements is from bucket sort algorithm.
    //1. In this method we create a bucket whose length is equal to the maximum element in the array.
    //2. Then we increase the index value by 1 every time we encounter an element that is equal to the index number.
    //3. Hence, we get an array which holds the frequency of each unique element in the array.
    //4. Then we convert the bucket array into a running summation array, so that we can get the number of elements smaller than current element.
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] frequencyBucket = new int[findMax(nums)+1];
        int[] res = new int[nums.length];
        for (int i =0; i < nums.length; i++) frequencyBucket[nums[i]]++;

        for (int i = 1 ; i < frequencyBucket.length; i++) frequencyBucket[i] += frequencyBucket[i-1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) res[i] = 0;
            else res[i] = frequencyBucket[nums[i] - 1];
        }
        return res;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(Max)
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(findMax(arr));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
