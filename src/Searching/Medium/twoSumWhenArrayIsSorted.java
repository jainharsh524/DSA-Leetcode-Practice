package Searching.Medium;

//Q.167 https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class twoSumWhenArrayIsSorted {
//    public static int floor(int[] arr, int target){
////        if(target<arr[0]) return -1;
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == target) return mid;
//            else if (arr[mid] > target) high = mid - 1;
//            else low = mid + 1;
//        }
//        return high;
//    }
//    public static int search(int[] arr, int target){
////        if(target<arr[0]) return -1;
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == target) return mid;
//            else if (arr[mid] > target) high = mid - 1;
//            else low = mid + 1;
//        }
//        return -1;
//    }
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] indexArray = new int[2];
//        int limit = floor(numbers, target);
//        for (int i = 0; i <= limit; i++) {
//            int newTarget = target-numbers[i];
//            int index = search(numbers, newTarget);
//            if(index!=-1) {
//                if(i>index) {
//                    indexArray[0] = index;
//                    indexArray[1] = i;
//                }
//                else{
//                    indexArray[1] = index;
//                    indexArray[0] = i;
//                }
//            }
//        }
//        return indexArray;
//    }
    //This approach was taking O(NlogN) time complexity and it was not working for 1 testcase in leetcode.
    //This approach used Binary Search to search the element.

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int Sum = numbers[low] + numbers[high];
            if (Sum == target) return new int[]{low + 1, high + 1};
            else if (Sum > target) high--;
            else low++;
        }
        return new int[]{-1, -1}; // If no solution is found
    }
    //Above written approach uses 2-pointer method for the sum, But it does not use the binary search.
    //It is an optimized solution for the problem in O(N) Time complexity.

    public static void main(String[] args) {
    }
}
