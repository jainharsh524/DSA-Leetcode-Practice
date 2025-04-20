package Arrays.Easy;

//Q.1929 https://leetcode.com/problems/concatenation-of-array/description/
public class concatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] nums1 = new int[nums.length*2];
        for(int i =0;i< nums.length;i++){
            nums1[i] = nums[i];
            nums1[i+ nums.length] = nums[i];
        }
        return nums1;
    }
    public static void main(String[] args) {

    }
}
