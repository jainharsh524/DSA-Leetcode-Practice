package bitwise.Medium;

//Q.137 https://leetcode.com/problems/single-number-ii/
public class singleNumberII {
    //Algorithm
    //Initialize result = 0.
    //Loop through each bit position i from 0 to 31:
    //For each number in the array, right-shift by i and mask the LSB: (num >> i) & 1.
    //Add this to a sum counter.
    //After processing all numbers, do sum % 3. If the result is 1, it means the unique number has a 1 at bit i.
    //Set that bit in result using result |= (sum << i).
    //Return result.
    //This works even for negative numbers, because Java uses 2’s complement and bitwise operations preserve the sign bit (bit 31).
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            sum %= 3;
//            System.out.println(sum);
            result += (sum << i);
//            System.out.println(result);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
