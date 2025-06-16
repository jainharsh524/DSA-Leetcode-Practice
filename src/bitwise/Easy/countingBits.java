package bitwise.Easy;

import java.util.Arrays;

//Q.338 https://leetcode.com/problems/counting-bits/description/
public class countingBits {
    public int hammingWeight(int num) {
        int count = 0;
        while (num>0){
            int end = num&1;
            if(end==1) count++;
            num = num>>1;
            // Another way of doing it
//            count++;
//            num = num&(num-1);
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = hammingWeight(i);
        }
        return arr;
    }
    public static int[] countBits1(int n) {
        int[] arr = new int[n+1];
        if(n==0){
            arr[0] = 0;
        }
        else if(n>=1) {
            arr[0] = 0;
            arr[1] = 1;
            int i = 2;
            int j = 0;
            if(n==2){
                j = 3;
            }
            else j = 4;
            while(j<=n+1){
                int count = 0;
                while(i<j){
                    arr[i] = arr[count]+1;
                    count++;i++;
                }
                if(j<n+1) {
                    j = Math.min(j * 2, n+1);
                }
                else break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits1(16)));
    }
}
