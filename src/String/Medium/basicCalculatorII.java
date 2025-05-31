package String.Medium;

//Q.227 https://leetcode.com/problems/basic-calculator-ii/description/
public class basicCalculatorII {
    public static boolean isOperator(char c){
        return c=='+'||c=='-'||c=='*'||c=='/';
    }
    public static int calculate(String s) {
        s = s.replace(" ", "");
        int res = 0;
        int numLeft = 0;
        int numRight = 0;
        if(!s.contains("+")&&!s.contains("-")&&!s.contains("*")&&!s.contains("/")){
            return Integer.parseInt(s);
        }
        else {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    numLeft = numLeft * 10 + (c - '0');
                }
                if(isOperator(c)){
                    if(c=='/'){
                        if (Character.isDigit(c)) {
                            numRight = numRight * 10 + (c - '0');
                        }
                        else {
                            res = numLeft/numRight;
                            numLeft=res;
                            numRight = 0;
                            int left = (int) (Math.log10(numLeft)+1);
                            int right = (int) (Math.log10(numRight)+1);
                            sb = sb.delete(i-left, i+right);

                        }
                    }
                    else {

                    }
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    int a = s.charAt(i - 1) - '0';
                    int b = s.charAt(i + 1) - '0';
                    res = a * b;
                    sb.deleteCharAt(i + 1);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i - 1);
                    sb.insert(i - 1, res);
                    s = sb.toString();
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '+') {
                    int a = s.charAt(i - 1) - '0';
                    int b = s.charAt(i + 1) - '0';
                    res = a + b;
                    sb.deleteCharAt(i + 1);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i - 1);
                    sb.insert(i - 1, res);
                    s = sb.toString();
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') {
                    int a = s.charAt(i - 1) - '0';
                    int b = s.charAt(i + 1) - '0';
                    res = a - b;
                    sb.deleteCharAt(i + 1);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i - 1);
                    sb.insert(i - 1, res);
                    s = sb.toString();
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345");
        sb.insert(2,12);
        System.out.println(sb);
        System.out.println(calculate(" 3+5 / 2 "));
    }
}
