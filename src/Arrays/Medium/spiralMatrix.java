package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

//Q.54 https://leetcode.com/problems/spiral-matrix/
public class spiralMatrix {
    //# Approach
    //1. The algorithm simulates peeling off the outer layer of the matrix, spiraling in.
    //2. It uses boundary pointers (top, bottom, left, right) to keep track of which rows/columns have been visited.
    //3. This is a time-efficient solution: O(m * n) where m is the number of rows and n is the number of columns.
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
    //# Complexity
    //- Time complexity:O(M*N)
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(spiralOrder(matrix));
    }
}
