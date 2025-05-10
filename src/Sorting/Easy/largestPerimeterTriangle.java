package Sorting.Easy;

import java.util.Arrays;

//Q.976 https://leetcode.com/problems/largest-perimeter-triangle/description/
public class largestPerimeterTriangle {
    //This code is giving error of time limit exceeded
//    public static int largestPerimeter(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int maxPerimeter = 0;
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                int a = nums[i];
//                int b = nums[j];
//                int target = a + b;
//                //nums[k] < a + b
//                int low = j + 1, high = n - 1, k = -1;
//                while (low <= high) {
//                    int mid = low + (high - low) / 2;
//                    if (nums[mid] < target) {
//                        k = mid;
//                        low = mid + 1;
//                    }
//                    else high = mid - 1;
//                }
//                if (k != -1) maxPerimeter = Math.max(maxPerimeter, a + b + nums[k]);
//            }
//        }
//
//        return maxPerimeter;
//    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; --i)
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2};
        System.out.println(largestPerimeter(nums));  // Output: 5
    }
}
