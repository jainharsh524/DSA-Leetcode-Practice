package bitwise.Medium;

//Q.29 https://leetcode.com/problems/divide-two-integers/description/
//Unsolved: Time Limit Exceeded
public class divideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if (divisor == 1)
            return dividend;
        if (dividend < 0 && divisor < 0)
            return divide(-dividend, -divisor);
        else if (dividend < 0)
            return -divide(-dividend, divisor);
        else if (divisor < 0)
            return -divide(dividend, -divisor);
        if (divisor > dividend || dividend == 0)
            return 0;
        int sum = 0;
        int multi = 0;
        while (sum+divisor<=dividend) {
            sum = sum+divisor;
            multi++;
        }
        return multi;
    }

    public static void main(String[] args) {
        System.out.println(divide(7,-3));
    }
}
