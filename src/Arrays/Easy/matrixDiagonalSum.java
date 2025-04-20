package Arrays.Easy;

//Q.1572 https://leetcode.com/problems/matrix-diagonal-sum/description/
public class matrixDiagonalSum {
    //# Approach
    //For this question I used 2-ptr method to track both the diagonal. If we only had the orimary diagonal then we could have done this:
    //```
    //if(i==j)
    //sum = sum+mat[i][j];
    //1. But for this case, we have to get sum of secondary diagonal as well
    //2. so I took 2 ptrs. and 1st one was at 0 and 2nd one was at last index.
    //3. 1st ptr increased and 2nd decreases its position by one after each row.
    //4. At middle row if both the pointer are pointing to same element then count it only once.
    //5. Kept doing this till last.
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int i =0;
        int ptr1 = 0;
        int ptr2 = mat[0].length-1;
        while(i<mat.length ){
            if(ptr1!=ptr2) sum = sum + mat[i][ptr1] + mat[i][ptr2];
            else sum = sum+mat[i][ptr1];
            ptr1++;
            ptr2--;
            i++;
        }
        return sum;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(1)
    public static void main(String[] args) {

    }
}
