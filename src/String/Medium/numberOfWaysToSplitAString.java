package String.Medium;

//Q.1573 https://leetcode.com/problems/number-of-ways-to-split-a-string/description/
public class numberOfWaysToSplitAString {
    public static int numWays(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        int totalOnes = 0;

        // Count total number of 1s
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        // Case 1: All zeroes
        if (totalOnes == 0) {
            return (int) ((long)(n - 1) * (n - 2) / 2 % MOD);
        }

        // Case 2: Cannot divide into 3 equal parts
        if (totalOnes % 3 != 0) return 0;

        // Case 3: Exactly divisible
        int target = totalOnes / 3;
        int onesSeen = 0;
        long firstSplitWays = 0;
        long secondSplitWays = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '1') onesSeen++;

            if (onesSeen == target) firstSplitWays++;
            else if (onesSeen == 2 * target) secondSplitWays++;
        }

        return (int) (firstSplitWays * secondSplitWays % MOD);
    }
    //Both Methods are correct its just that my old method is taking O(N^2) that's why I optimized.
//    public static int sum(String s, int end){
//        int sum = 0;
//        for (int i = 0; i < end; i++) {
//            if(s.charAt(i)=='1') sum++;
//        }
//        return sum;
//    }
//    public static int sumBackwards(String s, int start){
//        int sum = 0;
//        for (int i = s.length()-1; i >= start; i--) {
//            if(s.charAt(i)=='1') sum++;
//        }
//        return sum;
//    }
//    public static long nCr(int n, int r) {
//        if (r > n) return 0;
//        long res = 1;
//        if (r > n - r)
//            r = n - r;
//
//        for (int i = 0; i < r; ++i) {
//            res *= (n - i);
//            res /= (i + 1);
//        }
//
//        return res;
//    }
//    public static int numWays(String s) {
//        int sum = sum(s, s.length());
//        int count1 = 0;
//        int count2 = 0;
//        if(sum==0){
//            return (int) nCr(s.length()-1, 2);
//        }
//        else if(sum%3!=0) return 0;
//        else if (sum % 3 == 0) {
//            int ptr1 = 0;
//            while (ptr1<s.length()){
//                if(sum(s, ptr1)<(sum/3)) ptr1++;
//                else if(sum(s, ptr1) == sum / 3) {
//                    count1++;ptr1++;
//                }
//                else break;
//            }
//            int ptr2 = s.length()-1;
//            while (ptr2>=0){
//                if(sumBackwards(s, ptr2)<(sum/3)) ptr2--;
//                else if(sumBackwards(s, ptr2) == sum / 3) {
//                    count2++;ptr2--;
//                }
//                else break;
//            }
//        }
//        return (count1*count2)%1000000007;
//    }
    public static void main(String[] args) {
        System.out.println(numWays("100100010100110"));
        String s = "123456789";
    }
}
