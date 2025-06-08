package Recursion.Easy;

//Q.231 https://leetcode.com/problems/power-of-two/description/
public class powerOfTwo {
    //Method using Recursion
    public static boolean helper(int n, int a){
        if(a==n) return true;
        else if(a<n) return helper(n, a*2);
        else return false;
    }

    //Method using Math
    public static boolean isPowerOfTwo(int n) {
//        return helper(n, 1);
        double log2_x = Math.log10(n)/Math.log10(2);
        String str = String.valueOf(log2_x);
        if(str.charAt(str.length()-1)=='0'&&str.charAt(str.length()-2)=='.') return true;
        else return false;
    }

    //Another Method using Bitwise Operators
    public static boolean isPowerOfTwo1(int n) {
        if ( n <= 0) return false;
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(9));
        double a = 7.0;

    }
}
