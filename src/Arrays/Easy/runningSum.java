package Arrays.Easy;

public class runningSum {
    //# Approach
    //If you see the summation pattern we have to sum the previous element and the current element in the array, and we can get the running sum easily.
    public int[] runningSum(int[] nums) {
        for(int i =1;i< nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    //# Complexity
    // - Time complexity:O(N)
    // - Space complexity:O(1)
    public static void main(String[] args) {

    }
}
