package Searching.Easy;

import java.util.Arrays;

//Q.888 https://leetcode.com/problems/fair-candy-swap/
//Sol. https://leetcode.com/problems/fair-candy-swap/solutions/6701441/easy-solution-using-binary-search-and-ha-tmoe/
public class fairCandySwap {
    //Algorithm: Fair Candy Swap using Binary Search
    //Helper Methods:
    //
    //sum(int[] arr): Calculates the total candies.
    //bSearch(int[] nums, int target): Binary search to find a value in a sorted array.
    //Sort both arrays:
    //
    //Sorting is done to allow binary search usage for optimal lookup.
    //Calculate total candies:
    //
    //totalAliceCandies and totalBobCandies hold the total number of candies each has.
    //Compute the difference:
    //
    //difference = |totalAlice - totalBob|
    //Since only one candy is to be swapped, we want to balance the totals:
    //Let Alice gives x, Bob gives y:
    //After swap: totalAlice - x + y = totalBob - y + x
    //Simplified: y - x = (totalBob - totalAlice)/2
    //Find a valid swap pair:
    //
    //If Alice has less total:
    //For each candy 'a' in Alice's list, search for a candy in Bob's list equal to a + difference/2
    //If Bob has less total:
    //For each candy b in Bob's list, search for a candy in Alice's list equal to b + difference/2
    //Use binary search for efficient lookup.
    //Return the pair found.
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int bSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] arr = new int[2];
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int totalAliceCandies = sum(aliceSizes);
        int totalBobCandies = sum(bobSizes);
        int difference = Math.abs(totalAliceCandies-totalBobCandies);
        if(totalAliceCandies<totalBobCandies){
            for (int i = 0; i < aliceSizes.length; i++) {
                int index = bSearch(bobSizes, aliceSizes[i]+(difference/2));
                if(index!=-1){
                    arr[0] = aliceSizes[i];
                    arr[1] = bobSizes[index];
                }
            }
        }
        else {
            for (int i = 0; i < bobSizes.length; i++) {
                int index = bSearch(aliceSizes, bobSizes[i]+(difference/2));
                if(index!=-1){
                    arr[0] = aliceSizes[index];
                    arr[1] = bobSizes[i];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
