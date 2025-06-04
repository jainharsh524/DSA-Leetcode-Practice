package String.Hard;

//Q.224 https://leetcode.com/problems/basic-calculator/
//Unsolved
public class basicCalculator {
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public static int calculateWithoutBrackets(String s) {
        int num = 0;
        char operator = '+';
        int last = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (isOperator(c) || i == s.length() - 1) {
                if (operator == '+') {
                    sum += last;
                    last = num;
                }
                else if (operator == '-') {
                    sum += last;
                    last = -num;
                }
                else if (operator == '*') last *= num;
                else if (operator == '/') last /= num;
                num = 0;
                operator = c;
            }
        }
        return sum += last;
    }
//    public static int calculate(String s) {
//        int res = 0;
//        if(!s.contains("(")) return calculateWithoutBrackets(s);
//        else {
//            int i = 0;
//            for (i = 0; i < s.length(); i++) {
//                if(s.charAt(i)=='(') break;
//            }
//            int j = 0;
//            for (int j = 0; j < s.length(); j++) {
//
//            }
//        }
//        return res;
//    }
    public static void main(String[] args) {

    }
}
