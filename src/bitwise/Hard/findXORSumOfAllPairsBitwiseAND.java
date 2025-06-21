package bitwise.Hard;

//Q.1835 https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
public class findXORSumOfAllPairsBitwiseAND {
    public int getXORSum(int[] A, int[] B) {
        int xorA = 0, xorB = 0;
        for (int a: A)
            xorA ^= a;
        for (int b: B)
            xorB ^= b;
        return xorA & xorB;
    }
    public static void main(String[] args) {

    }
}
