package Arrays.Easy;

//Q.867 https://leetcode.com/problems/transpose-matrix/description/
public class transposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] matrix1 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1[j][i] = matrix[i][j];
            }
        }
        return matrix1;
    }
    public static void main(String[] args) {

    }
}
