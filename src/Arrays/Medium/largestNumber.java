package Arrays.Medium;

import java.util.Arrays;
import java.util.Comparator;

//unsolved
//Q.179 https://leetcode.com/problems/largest-number/description/
public class largestNumber {
    public static char[] reverse(char[] arr){
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static String largestNumber(int[] nums) {
        String num = "";
        int maxDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=10){
                while(nums[i]>0){
                    num = num+nums[i]%10;
                    nums[i] = nums[i]/10;
                }
            }
            else num = num+nums[i];
        }
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        arr = reverse(arr);
        num = new String(arr);
        return num;
    }
    public static void main(String[] args) {
        String num = "4567821230";
//        System.out.println(num);
        int[] nums = {10,2};
        System.out.println(largestNumber(nums));
    }
}
