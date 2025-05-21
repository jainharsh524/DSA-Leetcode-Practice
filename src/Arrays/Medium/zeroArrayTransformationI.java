package Arrays.Medium;

//Q.3355 https://leetcode.com/problems/zero-array-transformation-i/description/
public class zeroArrayTransformationI {
//    public static int[] decrease(int[] nums, int index1, int index2){
//        for (int i = index1; i <= index2; i++) {
//            if(nums[i]>0) nums[i]--;
//        }
//        return nums;
//    }
//    public static boolean checkAllZeroes(int[] nums, int index1, int index2){
//        for (int i = index1; i <= index2; i++) {
//            if(nums[i]!=0) return false;
//        }
//        return true;
//    }
//    public static boolean isZeroArray(int[] nums, int[][] queries) {
//        for (int i = 0; i < queries.length; i++) {
//            decrease(nums, queries[i][0], queries[i][1]);
//        }
//        for (int i = 0; i < queries.length; i++) {
//            if(checkAllZeroes(nums, queries[i][0], queries[i][1])) return true;
//        }
//        return false;
//    }
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            diff[l]++;
            if (r + 1 < n) {
                diff[r + 1]--;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += diff[i];
            if (nums[i] > cnt) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums = {7};
        int[][] query = {{0,0}};

    }
}
