package Arrays.Medium;

import java.util.HashMap;

//Q.525 https://leetcode.com/problems/contiguous-array/description/
//Sol. https://leetcode.com/problems/contiguous-array/solutions/6741337/easy-java-solution-beats-96-in-on-time-b-vkmc/
public class contiguousArray {
    //Algorithm Explanation:
    //Convert 0s to -1s:
    //
    //Iterate through the array.
    //Replace every 0 with -1.
    //This transforms the problem into finding the longest subArray with sum = 0.
    //Initialize:
    //
    //A HashMap hm to store (prefixSum -> firstIndex) pairs.
    //An integer sum to track the prefix sum.
    //maxLen to keep track of the maximum subArray length found.
    //Variable j to temporarily store index when sum is seen again.
    //Traverse the array:
    //
    //For each index i:
    //Add nums[i] to sum.
    //If sum == 0, it means the subArray from 0 to i is balanced (equal 0s and 1s). Update maxLen = i + 1.
    //Else, check if this sum has been seen before in the HashMap:
    //If yes: Get the index j where it was first seen.
    //Compute length i - j, and update maxLen if it's larger.
    //If not seen before, put sum with its index into the HashMap.
    //Return maxLen as the result.
    public static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) nums[i]=-1;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int j =0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int len = 0;
            sum += nums[i];
            if(sum == 0){
                maxLen = i + 1;
            }
            else{
                if(hm.containsKey(sum)){
                    j = hm.get(sum);
                    len = i - j;
                    if(len>maxLen) {
                        maxLen = len;
                    }
                }
                else hm.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(arr));
    }
}
