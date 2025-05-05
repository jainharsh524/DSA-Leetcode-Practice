package Searching.Medium;

//Q.1802 https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/description/
//Sol. https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/solutions/6714409/easy-binary-search-solution-in-java-beats-100/
public class maximumValueAtGivenIndexInBoundedArray {
    //Approach
    //This is a classic binary search + greedy math problem. Let’s break it down in a structured way:
    //
    //What does this mean practically?
    //To maximize nums[index], you can try to "build a hill" with the peak at index.
    //
    //Example:
    //If index = 2, and you pick nums[2] = 4, the neighboring elements can be at most 3, then 2, then 1, and so on.
    //
    //So your array might look like:
    //
    //[1, 2, 4, 3, 2]  → Peak at index 2
    //But to keep the array valid:
    //
    //Values must stay positive
    //Total sum must stay ≤ maxSum
    //Key Insight
    //This problem reduces to:
    //
    //What's the maximum height you can place at index such that:
    //
    //You can build a pyramid from it (with step size -1 to the left and right),
    //You don't go below 1 anywhere,
    //And the total sum stays under maxSum.
    //Approach (Step-by-Step)
    //1. Binary Search on nums[index]
    //You can binary search on possible values of nums[index] (from 1 to maxSum).
    //
    //For each possible value x, ask:
    //Is it possible to build such an array with peak = x at position index?
    //
    //If yes → Try bigger
    //If no → Try smaller
    //
    //2. How to check if a value x is valid?
    //You must:
    //
    //Build the left side of the array ([0..index-1]) decreasing from x-1 to as low as 1
    //Build the right side ([index+1..n-1]) similarly from x-1 downward
    //Add the sum of the whole array and check if it is ≤ maxSum
    //Use math to compute the sum efficiently (like arithmetic series sum).

    public static  int maxValue(int n, int index, int maxSum) {
        int low = 1, high = maxSum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(n, index, maxSum, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean isValid(int n, int index, int maxSum, int peak) {
        long leftSum = calcSum(index, peak - 1);
        long rightSum = calcSum(n - index - 1, peak - 1);
        long total = leftSum + rightSum + peak;
        return total <= maxSum;
    }

    private static long calcSum(int length, int peak) {
        if (peak >= length) {
            return (long)(peak + (peak - length + 1)) * length / 2;
        } else {
            long decreasing = (long)(peak + 1) * peak / 2;
            long ones = (long)(length - peak);
            return decreasing + ones;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxValue(6,1,10));
        //0,1,2,1
    }
}
