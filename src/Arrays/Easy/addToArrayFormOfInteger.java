package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;


//Q.989 https://leetcode.com/problems/add-to-array-form-of-integer/
public class addToArrayFormOfInteger {
//    static long arrayToNum(int[] arr){
//        long count =0;
//        int a = 0;
//        for(int i = arr.length-1;i>=0;i--){
//            count = count+(long) (arr[i]*Math.pow(10,a));
//            a++;
//        }
//        return count;
//    }
//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> arr = new ArrayList<>();
//        long number = arrayToNum(num);
//        long newNumber = number+k;
//        while(newNumber>0){
//            int rem = (int) (newNumber%10);
//            arr.add(0,rem);
//            newNumber = newNumber/10;
//        }
//        return arr;
//    }
    //giving the error for this case: int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
    //Saw the solution
    //don't add whole number altogether.
    //go to summation basics.
    //start summation of ones place and add the result to list.
    //then tens, hundreds place etc.
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        while( i >= 0 || k > 0){
            if(i >= 0){
                k += num[i--];
            }
            result.add(0, k % 10);
            k /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//        System.out.println(arrayToNum(arr));
//        System.out.println(addToArrayForm(arr, 516));
        BigInteger largeNumber = new BigInteger("123456789012345678901234567890");
    }
}
