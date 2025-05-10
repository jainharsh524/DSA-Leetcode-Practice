package Sorting.Easy;

//Q.977 https://leetcode.com/problems/squares-of-a-sorted-array/
//Sol. https://leetcode.com/problems/squares-of-a-sorted-array/solutions/6731386/easy-java-solution-beats-100-using-2-poi-zkq4/
public class squaresOfSortedArrays {
    //Algorithm Steps
    //Initialize Two Pointers:
    //
    //i starts at the beginning (0)
    //j starts at the end (nums.length - 1)
    //Create Result Array:
    //
    //squaredNums of the same length as nums
    //index starts at the last position (nums.length - 1)
    //Loop While i <= j:
    //
    //Compare absolute values of nums[i] and nums[j]
    //Square the larger one and insert it at squaredNums[index]
    //Move the pointer (i or j) depending on which was larger
    //Decrease index by 1
    //End Condition:
    //
    //When all elements have been processed, squaredNums contains the squares in sorted order
    //Return squaredNums
    public static int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        int i =0;
        int j = nums.length-1;
        int index = j;
        while (i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])) {
                squaredNums[index] = nums[i]*nums[i];
                index--;i++;
            }
            else {
                squaredNums[index] = nums[j]*nums[j];
                index--;j--;
            }
        }
        return squaredNums;
    }
    public static void main(String[] args) {

    }
}
