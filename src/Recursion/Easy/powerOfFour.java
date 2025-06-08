package Recursion.Easy;

//Q.342 https://leetcode.com/problems/power-of-four/description/
public class powerOfFour {
    public boolean isPowerOfFour(int n) {
//        if ( n <= 0) return false;
//        else if(n==1) return true;
//        else return (n & (n-2)) == 0;
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }

    public boolean isPowerOfFour1(int n){
        double log4_x = Math.log10(n)/Math.log10(4);
        String str = String.valueOf(log4_x);
        if(str.charAt(str.length()-1)=='0'&&str.charAt(str.length()-2)=='.') return true;
        else return false;
    }

}
