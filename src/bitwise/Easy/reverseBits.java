package bitwise.Easy;

//Q.190 https://leetcode.com/problems/reverse-bits/description/
//unsolved
public class reverseBits {
    public static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        System.out.println(sb);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(111101000));
    }
}
