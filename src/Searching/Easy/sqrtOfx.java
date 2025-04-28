package Searching.Easy;

//Q.69 https://leetcode.com/problems/sqrtx/
public class sqrtOfx {
    //# Approach
    //Just use the binary search and return high
    // because after the ending of loop at the last stage high and low will be interchanged
    // and that's why we break the loop condition and return the end.
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int low = 0;
        int high = x;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==x) return mid;
            else if(((long) mid *mid)<(long)x) low = mid+1;
            else if(((long)mid*mid)>(long)x) high = mid-1;
        }
        return high;
    }
    //# Complexity
    //- Time complexity:O(logN)
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
