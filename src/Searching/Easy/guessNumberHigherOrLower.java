package Searching.Easy;

//Q.374 https://leetcode.com/problems/guess-number-higher-or-lower/
public class guessNumberHigherOrLower {
    //here m is the picked number by guess API.
    //Open the question, you will understand the thing.
    public static int guessNumber(int n, int m) {
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid==m) return mid;
            else if(mid<m) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}
