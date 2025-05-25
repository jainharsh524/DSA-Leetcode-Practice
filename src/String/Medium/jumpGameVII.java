package String.Medium;

//Q.1871 https://leetcode.com/problems/jump-game-vii/
//unsolved
public class jumpGameVII {
    public static int findNextZero(String s, int index1){
        for (int i = index1+1 ; i < s.length(); i++) {
            if(s.charAt(i)=='0') return i;
        }
        return -1;
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int curr = 0;
        while (curr<s.length()-1){
            int next = findNextZero(s, curr);
            if(next!=-1){
                if(next-curr<minJump||next-curr>maxJump) return false;
            }
            else if(next==-1) {
                if(s.length()-1-curr<minJump||s.length()-1-curr>maxJump) return false;
            }
            curr = next;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canReach("01101110", 2,3));
    }
}
