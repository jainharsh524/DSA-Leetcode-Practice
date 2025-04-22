package Arrays.Easy;

//Q.53 https://leetcode.com/problems/maximum-subarray/description/
//Unsolved because it is of D&C or DP.
public class maximumSubArray {
    public static boolean checkAllNegative(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i]<0)) return false;
        }
        return true;
    }
    public static int min(int[] arr){
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minElement<arr[i]) minElement = arr[i];
        }
        return minElement;
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        if(checkAllNegative(nums)) return min(nums);
        for(int i =0;i<nums.length;i++){
            int temp = sum;
            sum = sum+nums[i];
            if(sum<0){
                sum = 0;
            }
            if(sum<temp){
                int sum1 = 0;
                for(int j =i;j<nums.length;j++){
                    sum1 = sum1+nums[j];
                }
                if(sum1<0){
                    sum = temp;
                    return sum;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,-3,-3,1,3,0};
        System.out.println(maxSubArray(arr));
    }
}
