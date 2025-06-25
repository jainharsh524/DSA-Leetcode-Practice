package String.Medium;

import java.util.HashMap;

//Q.12 https://leetcode.com/problems/integer-to-roman/description/?envType=problem-list-v2&envId=string
public class integerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num>0){
            if(num>=1000){
                num = num-1000;
                sb.append('M');
            }
            else if(num>=900&&num<1000){
                num = num-900;
                sb.append("CM");
            }
            else if(num>=500&&num<900){
                num = num-500;
                sb.append('D');
            }
            else if(num>=400&&num<500){
                num = num-400;
                sb.append("CD");
            }
            else if(num>=100&&num<400) {
                num = num-100;
                sb.append('C');
            }
            else if(num>=90&&num<100){
                num = num-90;
                sb.append("XC");
            }
            else if(num>=50&&num<90){
                num = num-50;
                sb.append('L');
            }
            else if(num>=40&&num<50){
                num = num-40;
                sb.append("XL");
            }
            else if(num>=10&&num<40) {
                num = num-10;
                sb.append('X');
            }
            else if(num==9){
                num = num-9;
                sb.append("IX");
            }
            else if(num>=5&&num<9){
                num = num-5;
                sb.append('V');
            }
            else if(num==4){
                num = num-4;
                sb.append("IV");
            }
            else if(num>=1&&num<4) {
                num = num-1;
                sb.append('I');
            }
        }
        return sb.toString();
    }
    public String intToRoman1(int num) {
        String[] romanSymbols = new String[]{"M", "CM", "D", "CD", "C", "XC" , "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 ,4, 1};

        StringBuilder result = new StringBuilder();
        for(int i=0; i< values.length;i++){
            if(num == 0) break;

            if(num >= values[i]){
                result.append(romanSymbols[i]);
                num -= values[i];
                i--;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

    }
}
