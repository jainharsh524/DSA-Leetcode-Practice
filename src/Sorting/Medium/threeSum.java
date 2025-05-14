package Sorting.Medium;

import java.util.*;

//Q.15 https://leetcode.com/problems/3sum/
//Sol. https://leetcode.com/problems/3sum/solutions/6744244/easy-solution-using-binary-search-by-jai-fu0s/
public class threeSum {
//    static int binarySearching(int[] arr, int target){
//        int high = arr.length-1;
//        int low = 0;
//        while(high>=low){
//            int mid = low+(high-low)/2;
//            if(arr[mid]==target) return mid;
//            else if(arr[mid]>target) high = mid-1;
//            else low = mid+1;
//        }
//        return -1;
//    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> lst = new ArrayList<>();
//        Set<List<Integer>> st = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                int newTarget = -(nums[i] + nums[j]);
//                int index = binarySearching(nums, newTarget);
//                if(index!=-1&&index!=i&&index!=j){
//                    int[] arr = {nums[i],nums[j],nums[index]};
//                    Arrays.sort(arr);
//                    st.add(new ArrayList<>(Arrays.asList(arr[0], arr[1], arr[2])));
//                }
//            }
//        }
//        return st.stream().toList();
//    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
}
