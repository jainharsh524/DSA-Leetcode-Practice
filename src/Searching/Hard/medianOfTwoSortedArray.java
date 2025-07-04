package Searching.Hard;

//Q.4 https://leetcode.com/problems/median-of-two-sorted-arrays/
public class medianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;

        // Find median.
        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) m1 = nums2[j++];
                else m1 = nums1[i++];
            }
            else if (i < n) m1 = nums1[i++];
            else m1 = nums2[j++];
        }
        if ((n + m) % 2 == 1) {
            return (double) m1;
        } else {
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }
    public static void main(String[] args) {

    }
}
