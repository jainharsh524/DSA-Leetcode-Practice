package Sorting.Medium;

import java.util.Arrays;

//Q.16 https://leetcode.com/problems/3sum-closest/description/
//Sol. https://leetcode.com/problems/3sum-closest/solutions/6746566/easy-java-solution-using-2-pointer-metho-vinl/
public class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDifference = 10000;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(minDifference)>Math.abs(target-sum)){
                    minDifference = target-sum;
                }
                if(sum>target) k--;
                if(sum<=target) {
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return target-minDifference;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(threeSumClosest(arr, 1));
    }
}
