package bitwise.Easy;

//Q.136 https://leetcode.com/problems/single-number/description/
public class singleNumber {
    public static int singleNumber(int[] nums) {
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a = a^nums[i];
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
