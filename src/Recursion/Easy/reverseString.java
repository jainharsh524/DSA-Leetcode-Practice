package Recursion.Easy;

import java.util.Arrays;

//Q.344 https://leetcode.com/problems/reverse-string/
public class reverseString {
    public static void reverseHelper(char[] s, int i, int j){
        if(i<j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            reverseHelper(s, i + 1, j - 1);
        }
    }
    public static void reverseString(char[] s) {
        reverseHelper(s,0,s.length-1);
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
