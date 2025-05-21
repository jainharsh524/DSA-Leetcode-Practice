package String.Easy;

//Q.709 https://leetcode.com/problems/to-lower-case/
public class toLowerCase {
    public static String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='Z'&&s.charAt(i)>='A'){
                s = s.replace(s.charAt(i), (char) (s.charAt(i)+32));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
}
