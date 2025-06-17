package bitwise.Easy;

//Q.461 https://leetcode.com/problems/hamming-distance/
public class hammingDistance {
    public static int hammingWeight(int num) {
        int count = 0;
        while (num>0){
            int end = num&1;
            if(end==1) count++;
            num = num>>1;
        }
        return count;
    }
    public static int hammingDistance(int x, int y) {
        int a = x^y;
        return hammingWeight(a);
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
}
