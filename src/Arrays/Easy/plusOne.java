package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q.66 https://leetcode.com/problems/plus-one/
public class plusOne {
    //# Approach
    //I learnt this approach from Que:989 https://leetcode.com/problems/add-to-array-form-of-integer/.
    //I just went back to basics of addition.
    //1. Scan the array from backwards.
    //2. First add the numbers on ones place and append the result(only ones place of result) to arraylist and extract the carry.
    //3. Then go to tens place and add the carry to it and append that to result.
    //4. keep doing that and at kast check if there is any carry or not.
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        int a = digits[digits.length-1];
        a = a+1;
        result.add(0,a % 10);
        carry = a / 10;
        for(int i =digits.length-2;i>=0;i--){
            int newValue = digits[i]+carry;
            result.add(0,newValue%10);
            carry = newValue/10;
        }
        if(carry!=0){
            result.add(0,carry);
        }
        int[] res = new int[result.size()];
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
    //# Complexity
    //- Time complexity:O(N)
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
