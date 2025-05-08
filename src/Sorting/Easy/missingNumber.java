package Sorting.Easy;

//Q.268 https://leetcode.com/problems/missing-number/
//Sol. https://leetcode.com/problems/missing-number/solutions/6726340/easy-java-solution-using-cyclic-sort-alg-c4ml/
public class missingNumber {
    //Algorithm for missingNumber(int[] nums) using Cyclic Sort
    //Initialize index i = 0.
    //
    //Rearrange the array using cyclic sort:
    //
    //While i < nums.length, do:
    //If nums[i] < nums.length and nums[i] != i,
    //→ Swap nums[i] with nums[nums[i]].
    //Else,
    //→ Increment i.
    //Scan the array to find the missing number:
    //
    //Loop from j = 0 to nums.length - 1:
    //If nums[j] != j,
    //→ Return j as the missing number.
    //If all elements are at correct positions,
    //→ Return nums.length as the missing number (i.e., n is missing).
    //
    //Complexity
    //Time complexity: O(N)
    //Space complexity: O(1)
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length) {
            if(nums[i]<nums.length&&nums[i]!=i){
                swap(nums, i, nums[i]);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }
    //Another algorithm using Math
    //The code you’ve written calculates the missing number in an array using the mathematical formula for the sum of the first n natural numbers. Here's an explanation of the logic in steps:
    //
    //✅ Algorithm Explanation (Sum Formula Approach)
    //Let n be the length of the nums array.
    //Compute the expected sum of numbers from 0 to n using the formula:
    //sum=
    //2
    //n×(n+1)
    //​
    //
    //Initialize newSum = 0.
    //Loop through the array and compute the actual sum of elements in nums.
    //The missing number will be the difference between the expected sum and the actual sum:
    //missingNumber=sum−newSum

//    public static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int sum = (n*(n+1))/2;
//        int newSum=0;
//        for(int i =0;i<nums.length;i++){
//            newSum+=nums[i];
//
//        }
//        return sum-newSum;
//
//    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
