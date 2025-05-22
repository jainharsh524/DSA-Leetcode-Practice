package String.Easy;

//Q.1309 https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class decryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while (i>=0){
            int num = 0;
            if(s.charAt(i)=='#'){
                num = num+s.charAt(i-1)-48;
                num = num+(s.charAt(i-2)-48)*10;
                i = i-3;
                char ch = (char) (num+'`');
                sb.append(ch);
            }
            else{
                num = num+s.charAt(i)-48;
                char ch = (char) (num+'`');
                sb.append(ch);
                i--;
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
}
