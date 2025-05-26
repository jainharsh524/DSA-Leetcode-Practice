package String.Medium;

//Q.686 https://leetcode.com/problems/repeated-string-match/description/
//Unsolved
public class repeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder repeatA = new StringBuilder(a);
        int count = 1;
        while (repeatA.length() < b.length()) {
            repeatA.append(a);
            count++;
            if (repeatA.toString().contains(b)) return count;
        }
        repeatA.append(a);
        count++;
        if (repeatA.toString().contains(b)) return count;

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("a", "aa"));
    }
}
