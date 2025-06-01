package Arrays.Medium;

//Q.2348 https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
public class numberOfZeroFilledSubArrays {
        /**
         * Time Complexity: O(n) where n is the length of the nums array
         * - We iterate through the array once, performing constant time operations at each step
         *
         * Space Complexity: O(1)
         * - We only use a constant amount of extra space (two variables) regardless of input size
         * - No additional data structures that scale with input
         */
        public long zeroFilledSubarray(int[] nums) {
            long contCount = 0;    // Count of continuous zeros in current sequence
            long subarrays = 0;    // Total count of zero-filled subarrays

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    contCount++;               // Increment count of continuous zeros
                    subarrays += contCount;    // Add count to total (optimization)
                    /*
                     * This is an optimization over the n*(n+1)/2 approach.
                     * Each new zero adds (current length) new subarrays:
                     * - For the 1st zero: adds 1 subarray
                     * - For the 2nd zero: adds 2 subarrays (one ending at this zero, one containing both zeros)
                     * - For the 3rd zero: adds 3 subarrays, and so on
                     */
                }
                else {
                    contCount = 0; // Reset continuous count when non-zero is encountered
                }
            }

            return subarrays;
        }
}
