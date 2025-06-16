package bitwise.Easy;

//Q.191 https://leetcode.com/problems/number-of-1-bits/
public class numberOf1Bits {
    public int hammingWeight(int num) {
        int count = 0;
        while (num>0){
            int end = num&1;
            if(end==1) count++;
            num = num>>1;
            // Another way of doing it
//            count++;
//            num = num&(num-1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
