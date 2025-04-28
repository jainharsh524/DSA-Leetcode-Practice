package Searching.Easy;

//Q.367 https://leetcode.com/problems/valid-perfect-square/description/
public class validPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid*mid==(long)num) return true;
            else if(((long) mid *mid)<(long)num) low = mid+1;
            else if(((long)mid*mid)>(long)num) high = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
