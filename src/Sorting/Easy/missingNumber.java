package Sorting.Easy;

//Q.268 https://leetcode.com/problems/missing-number/
//Sol. https://leetcode.com/problems/missing-number/solutions/6726340/easy-java-solution-using-cyclic-sort-alg-c4ml/
public class missingNumber {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length) {
            if(nums[i]<nums.length&&nums[i]!=i){
                swap(nums, i, nums[i]);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }
//    public static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int sum = (n*(n+1))/2;
//        int newSum=0;
//        for(int i =0;i<nums.length;i++){
//            newSum+=nums[i];
//
//        }
//        return sum-newSum;
//
//    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
