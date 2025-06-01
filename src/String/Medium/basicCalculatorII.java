package String.Medium;

//Q.227 https://leetcode.com/problems/basic-calculator-ii/description/
public class basicCalculatorII {
    public static int calculate(String s) {
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

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345");
        sb.insert(2,12);
        System.out.println(sb);
        System.out.println(calculate(" 3+5 / 2 "));
    }
}
