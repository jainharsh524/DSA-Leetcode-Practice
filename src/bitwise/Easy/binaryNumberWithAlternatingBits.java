package bitwise.Easy;

//Q.693 https://leetcode.com/problems/binary-number-with-alternating-bits/description/
public class binaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int num) {
        int prev = -1;
        while (num>0){
            int curr = num&1;
            num = num>>1;
            if(prev==curr) return false;
            else prev = curr;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
