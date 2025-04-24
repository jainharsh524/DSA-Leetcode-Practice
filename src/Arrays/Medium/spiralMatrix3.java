package Arrays.Medium;

import java.util.Arrays;

//Q.885 https://leetcode.com/problems/spiral-matrix-iii/
public class spiralMatrix3 {
    //unsolved
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows*cols][2];
        int right = 1, down = 1;
        int left = right+1, up = down+1;
        int index = 0;
        while(index<rows*cols){
            int i =0;
            //right
            while(cStart<cols&&i<=right&&index<rows*cols){
                matrix[index] = new int[]{rStart, cStart};
                cStart = cStart+1;
                index++;i++;
            }
            right++;
            int j=0;
            //down
            while (rStart<rows&&j<down&&index<rows*cols) {
                matrix[index] = new int[]{rStart, cStart};
                rStart = rStart+1;
                index++;j++;
            }
            down++;
            int k =0;
            //left
            while(k<left&&cStart>=0&&index<rows*cols){
                matrix[index] = new int[]{rStart, cStart};
                cStart = cStart-1;
                index++;k++;
            }
            left++;
            int l = 0;
            //up
            while (l<up&&rStart>=0&&index<rows*cols) {
                matrix[index] = new int[]{rStart, cStart};
                rStart = rStart-1;
                index++;l++;
            }
            up++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = spiralMatrixIII(5,6,1,4);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i])+", ");
        }
    }
}
