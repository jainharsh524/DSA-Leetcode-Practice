package Searching.Easy;
//Q.278 https://leetcode.com/problems/first-bad-version/
public class firstBadVersion {
    //here m is the picked number by badVersion API.
    //Open the question, you will understand the thing.
    public int firstBadVersion(int n, int m) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == m) return mid;
            else if (mid < m) low = mid + 1;
            else high = mid - 1;
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
