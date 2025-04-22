package Arrays.Easy;
import java.util.ArrayList;
import java.util.List;

//Q.1380 https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class luckyNumbersInMatrix {
    public static int minIndex(int[] arr){
        int minElementIndex = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[minElementIndex] >arr[i]) minElementIndex = i;
        }
        return minElementIndex;
    }
    public static boolean checkMax(int[][] matrix, int col, int row){
        for(int i =0;i<matrix.length;i++){
            if(!(matrix[row][col]>=matrix[i][col])) return false;
        }
        return true;
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumber= new ArrayList<>(3);
        for(int i =0;i< matrix.length;i++){
            int col = minIndex(matrix[i]);
            if(checkMax(matrix, col, i)) luckyNumber.add(matrix[i][col]);
        }
        return luckyNumber;
    }
    //# Complexity
    //- Time complexity: O(N*N)
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
