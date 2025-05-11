import java.util.*;
public class Main {
    public static int maxProduct(int n) {
        int product = 1;
        int[] arr = new int[(int)Math.log(n)+1];
        int i =0;
        while(n>0){
            int digit = n%10;
            arr[i] = digit;
            i++;
            n = n/10;
        }
        System.out.println(Math.pow(2,5));
        Arrays.sort(arr);
        System.out.println(arr);
        return product*arr[arr.length-1]*arr[arr.length-2];
    }
    public static int[][] fillArray(int[][] arr, int row, int col, int maxVal){
        arr[row][col] = maxVal--;
        arr[row+1][col] = maxVal--;
        arr[row+1][col+1] = maxVal--;
        arr[row][col+1] = maxVal;
        return arr;
    }
    public static int[][] specialGrid(int n) {
        int max = (int) (Math.pow(2,2*n)-1);
        int[][] arr = new int[(int)Math.pow(2,n)][(int)Math.pow(2,n)];
        int row = 0;
        int col = 0;
        if(n==0){
            arr[0][0] = 0;
            return arr;
        } else if (n == 1) {
            return fillArray(arr, row, col, max);
        }
        else {

        }
        return arr;
    }

    public static void main(String[] args) {
//        System.out.println(maxProduct(124));
        int[][] arr = specialGrid(3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Hello world!");
    }
}