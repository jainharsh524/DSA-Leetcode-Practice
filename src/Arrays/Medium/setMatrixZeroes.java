package Arrays.Medium;

import java.util.Arrays;

//Q.73 https://leetcode.com/problems/set-matrix-zeroes/
public class setMatrixZeroes {
    //# Approach
    //1. For this question initially I used an arraylist to store the indexes of the places at which value is zero.
    //2. After that I approached for constant space. To do so, I used the hints of this question. According to the last hint for constant space I used 1st row and col as zero index indicater.
    //3. But if there are any zeroes in 1st row or col then for that I kept 2 boolean variable.


    //solution with extra space
//    public void setZeroes(int[][] matrix) {
//        List<Integer> row = new ArrayList<>();
//        List <Integer> cols = new ArrayList<>();
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==0){
//                    row.add(i);
//                    cols.add(j);
//                }
//            }
//        }
//        System.out.println(row);
//        System.out.println(cols);
//        for(int i=0;i<row.size();i++){
//            for (int j=0;j<matrix[0].length;j++){
//                if(matrix[row.get(i)][j]!=0){
//                    matrix[row.get(i)][j]=0;
//                }
//            }
//            for (int j=0;j<matrix.length;j++){
//                if(matrix[j][cols.get(i)]!=0){
//                    matrix[j][cols.get(i)]=0;
//                }
//            }
//        }
//
////        matrix = new int[matrix.length+1][matrix[0].length+1];
//        System.out.println(Arrays.deepToString(matrix));
//    }
    //solution with constant space
    public static void setZeroes(int[][] matrix) {
        boolean flagRow = false, flagCol = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        flagRow = true;
                    if (j == 0)
                        flagCol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if ((matrix[i][0] == 0 || matrix[0][j] == 0) && matrix[i][j] != 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (flagRow) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if (flagCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    //# Complexity
    //- Time complexity: O(N^2)
    //- Space complexity: O(1);
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
