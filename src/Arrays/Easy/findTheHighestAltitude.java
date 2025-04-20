package Arrays.Easy;

//Q.1732 https://leetcode.com/problems/find-the-highest-altitude/description/
public class findTheHighestAltitude {
    //# Approach
    //To find the highest altitude we are doing running sum of an array
    // because initially the person is on altitude 0.
    // Then wherever he goes the height will be resultant of net height or the summation of heights he has been climbing.
    public int[] runningSum(int[] nums) {
        for(int i =1;i< nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    public static int max(int[] arr){
        int max =arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
    public int largestAltitude(int[] gain) {
        gain = runningSum(gain);
        if(max(gain)>0) return max(gain);
        else return 0;
    }
    //# Complexity
    //- Time complexity: O(N)
    //- Space complexity: O(1)
    public static void main(String[] args) {

    }
}
