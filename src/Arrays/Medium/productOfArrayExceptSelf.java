package Arrays.Medium;

import java.util.Arrays;

//Q.238 https://leetcode.com/problems/product-of-array-except-self/
public class productOfArrayExceptSelf {
    //Brute Force
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int ans[] = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            int pro = 1;
//            for(int j = 0; j < n; j++) {
//                if(i == j) continue;
//                pro *= nums[j];
//            }
//            ans[i] = pro;
//        }
//
//        return ans;
//    }
    //using prefix and suffix array
    //Similar to finding Prefix Sum Array, here we would intend to find the Prefix Product Array and Suffix Product Array for our original array, i.e. pre[i] = pre[i - 1] * a[i - 1] (yes, we multiply with a[i - 1] and not with a[i] on purpose) and similarly suffix[i] = suffix[i + 1] * a[i + 1].
    //Now, at any index i our final answer ans[i] would be given by ans[i] = prefix[i] * suffix[i]. Why? Because the prefix[i] * suffix[i] contains product of every element before i and every element after i but not the element at index i (and that is the reason why we excluded a[i] in our prefix and suffix product).
    //The Time Complexity would be O(n), but we are now using Auxiliary Space of O(n) (excluding the final answer array).
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int prefix[] = new int[n];
//        int suffix[] = new int[n];
//        prefix[0] = 1;
//        suffix[n - 1] = 1;
//
//        for(int i = 1; i < n; i++) {
//            prefix[i] = prefix[i - 1] * nums[i - 1];
//        }
//        for(int i = n - 2; i >= 0; i--) {
//            suffix[i] = suffix[i + 1] * nums[i + 1];
//        }
//
//        int[] ans= new int[n];
//        for(int i = 0; i < n; i++) {
//            ans[i] = prefix[i] * suffix[i];
//        }
//        return ans;
//    }
    //In constant space

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            res[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
