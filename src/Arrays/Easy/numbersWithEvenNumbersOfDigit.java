package Arrays.Easy;
//Q.1295 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class numbersWithEvenNumbersOfDigit {
    //There are 2 approaches for finding the number of digits:
    //1. You run a loop and do floor division by 10. keep doing that until you don't get 0 and then count the no. of times the loop is running.
    //2. Another method for doing this is by using the logarithmic formulae. Basically log base 10 gives the value that given number can be represented by which power of 10. That's why Formula for finding the number of digits: (int)Math.log10(num)+1
    static int numberOfDigits(int num){
        return (int)Math.log10(num)+1;
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(numberOfDigits(nums[i])%2==0) count++;
        }
        return count;
    }
}
//Complexity
//Time complexity: O(N)
//N: number of elements in the given array.
