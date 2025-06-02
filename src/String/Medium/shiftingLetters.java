package String.Medium;

//Q.848 https://leetcode.com/problems/shifting-letters/description/
public class shiftingLetters {
    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        long shift=0;
        for (int i = s.length()-1; i >=0 ; i--){
            sb.setCharAt(i, (char)((s.charAt(i) - 97 + (shift+shifts[i]) % 26) % 26 + 97));
            shift+=shifts[i];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "z";
        System.out.println(shiftingLetters(s, new int[]{52}));
    }
}
