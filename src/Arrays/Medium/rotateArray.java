package Arrays.Medium;

import java.util.Arrays;

//Q.189 https://leetcode.com/problems/rotate-array/description/
public class rotateArray {
    //Approach
    //For this question I tried 2 different approaches. By first approach I passed 37/38 test cases.
    //
    //🔁 Approach 1: Repeated Swapping (Bubble Rotation)
    //This approach rotates the array one step at a time — and does it k times.
    //
    //For each rotation step:
    //
    //Start from the end of the array.
    //Swap each adjacent pair from the end toward the rotation zone.
    //Effectively moves the last element to the front.
    //Repeat this k times.
    //
    //✅ Pros:
    //
    //Simple to understand
    //No extra space
    //❌ Cons
    //
    //Very inefficient for large k or arrays with many elements.(I realized it after seeing last test case. I am sure someone felt that this question is too easy to be a leecode medium. So he added his own giant test case😂😂).
    //Complexity
    //Time complexity:O(N*k)
    //
    //Space complexity:O(1)
    //
    //🔄 Approach 2: Reversal Algorithm (Efficient)
    //
    //Take k % n to handle cases where k > array length.
    //Reverse the whole array.
    //Reverse the first k elements (which are now the last k after full reverse).
    //Reverse the remaining n-k elements.
    //Complexity
    //Time complexity:O(N)
    //Space complexity:O(1)

//    public static int[] swap(int[] nums, int index1, int index2){
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//        return nums;
//    }
//    public static void rotate(int[] nums, int k) {
//        for(int i =k;i>0;i--) {
//            int currIndex = nums.length - i;
//            int preIndex = currIndex - 1;
//            while (preIndex >= k-i) {
//                swap(nums, preIndex, currIndex);
//                preIndex--;
//                currIndex--;
//            }
//        }
//    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
