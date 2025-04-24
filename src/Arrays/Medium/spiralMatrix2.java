package Arrays.Medium;
import java.util.Arrays;

//Q.59 https://leetcode.com/problems/spiral-matrix-ii/description/
public class spiralMatrix2 {
    //# Approach
    //1. You fill the matrix layer by layer in clockwise spiral order.
    //2. you can just reuse the code of 'SpiralMatrix 1' after doing some changes.
    //3. You have to fill the indexes increased by one as you traverse the index.
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int entry = 1;
        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = entry;
                entry++;
            }
            top++;
            // Right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = entry;
                entry++;
            }
            right--;
            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = entry;
                    entry++;
                }
                bottom--;
            }
            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = entry;
                    entry++;
                }
                left++;
            }
        }
        return matrix;
    }
    //# Complexity
    //- Time complexity: O(N*N)
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(1);
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
