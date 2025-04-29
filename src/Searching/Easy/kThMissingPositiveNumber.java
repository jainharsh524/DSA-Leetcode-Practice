package Searching.Easy;

//Q.1539 https://leetcode.com/problems/kth-missing-positive-number/
//Sol. https://leetcode.com/problems/kth-missing-positive-number/solutions/6698223/solution-in-ologn-and-logn-time-beats-10-e6hz/
public class kThMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int missingNumbers = arr[arr.length-1]-arr.length;
        if(missingNumbers<k){
            missingNumbers = k-missingNumbers;
            return arr[arr.length-1]+missingNumbers;
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                int missingNumberTillNow = arr[i]-i-1;
                if(missingNumberTillNow>=k){
                    missingNumberTillNow = arr[i]-i-1;
                    return arr[i]+k-missingNumberTillNow-1;
                }
            }
        }
        return 0;
    }

//    public int findKthPositive(int[] arr, int k) {
//        int left = 0, right = arr.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] - (mid + 1) >= k) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left + k;
//    }
    //Initialize pointers:
//left = 0, right = arr.length - 1
//Binary Search Loop:
//While left <= right:
//Compute mid = left + (right - left) / 2
//Compute missing numbers till index mid as arr[mid] - (mid + 1)
//(Since ideally the value at mid should be mid + 1)
//If the number of missing values ≥ k, then search in left half:
//Set right = mid - 1
//Else, search in right half:
//Set left = mid + 1
//After the loop ends:
//The left pointer tells us how many elements are present before the k-th missing number.
//So, the answer is: left + k
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr, 5));
    }
}
