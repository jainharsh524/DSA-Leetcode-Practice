package String.Medium;

//Q.1616 https://leetcode.com/problems/split-two-strings-to-make-palindrome/
public class splitTwoStringsToMakePalindrome {
    public static boolean isPalindrome(String s) {
        int i =0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        if(isPalindrome(a)||isPalindrome(b)) return true;
        else{
            int ptr1 = 0;
            int ptr2 = b.length()-1;
            while (ptr1 < a.length()-1 && ptr2 >= 0) {
                if (a.charAt(ptr1) != b.charAt(ptr2)) {
                    break;
                }
                ptr1++;
                ptr2--;
            }
            if(isPalindrome(String.copyValueOf(a.toCharArray(), ptr1, a.length()-ptr1-ptr2))||isPalindrome(String.copyValueOf(b.toCharArray(), ptr1, a.length()-ptr1-ptr2))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "harsh";
        String aPrefix = String.copyValueOf(a.toCharArray(), 1, 4);
        System.out.println(aPrefix);
        System.out.println(checkPalindromeFormation("xcfdaa", "jiaalu"));
    }
}
