package Searching.Easy;

//Q.441 https://leetcode.com/problems/arranging-coins/description/
public class arrangingCoins {
    //Approach
    //Easy solution, just used formula of AP to get the sum of series.
    //Sum of n terms in an AP = (n/2)(2a+(n-1)d)
    //
    //Complexity
    //Time complexity: O(logN)
    //Space complexity: O(1)
    public static long seriesSum(int n){
        return (long) n *(n+1)/2;
    }
    public static int arrangeCoins(int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = seriesSum(mid);
            if ((long)n == value) return mid;
            else if ((long)n < value) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
