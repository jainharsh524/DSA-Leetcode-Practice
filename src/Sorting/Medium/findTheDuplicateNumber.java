package Sorting.Medium;

//Q.287 https://leetcode.com/problems/find-the-duplicate-number/description/
//Sol. https://leetcode.com/problems/find-the-duplicate-number/solutions/6727831/easy-java-solution-using-cyclic-sort/
public class findTheDuplicateNumber {
//    public static int findDuplicate(int[] nums) {
//        int slow = nums[0];
//        int fast = nums[0];
//        do {
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        } while (slow != fast);
//        slow = nums[0];
//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[fast];
//        }
//        return slow;
//    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i< nums.length){
            if(nums[i]-1!=i&&nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j) return nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDuplicate(arr));
    }
}
