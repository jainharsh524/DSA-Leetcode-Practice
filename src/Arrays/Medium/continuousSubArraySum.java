package Arrays.Medium;

import java.util.HashMap;

//Q.523 https://leetcode.com/problems/continuous-subarray-sum/
//Sol. https://leetcode.com/problems/continuous-subarray-sum/solutions/6744394/easy-java-solution-with-prefix-sum-and-h-b41r/
public class continuousSubArraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int rem = sum%k;
            if(hm.containsKey(rem)&&i-hm.get(rem)>=2){
                return true;
            }
            else if(!hm.containsKey(rem))hm.put(rem, i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {5,0,0,0};
        System.out.println(checkSubarraySum(nums, 3));
    }
}
