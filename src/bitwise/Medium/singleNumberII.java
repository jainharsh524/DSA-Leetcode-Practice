package bitwise.Medium;

//Q.137 https://leetcode.com/problems/single-number-ii/
public class singleNumberII {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            sum %= 3;
//            System.out.println(sum);
            result += (sum << i);
//            System.out.println(result);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
