package String.Easy;

//Q.925 https://leetcode.com/problems/long-pressed-name/
//Unsolved
public class longPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length()<name.length()) return false;
        else {
            int i = 0;
            int j = 0;
            while (i<name.length()&&j<typed.length()){
                if(j<typed.length()-1&&name.charAt(i)==typed.charAt(j)&&typed.charAt(j+1)!=name.charAt(i)){
                    j++;i++;
                }
                else if (j<typed.length()-1&&name.charAt(i)==typed.charAt(j)&&typed.charAt(j+1)==name.charAt(i)) {
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
