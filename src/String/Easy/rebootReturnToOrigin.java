package String.Easy;

//Q.657 https://leetcode.com/problems/robot-return-to-origin/
public class rebootReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int countL = 0;
        int countR = 0;
        int countU = 0;
        int countD = 0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='L') countL++;
            else if(moves.charAt(i)=='R') countR++;
            else if(moves.charAt(i)=='U') countU++;
            else if(moves.charAt(i)=='D') countD++;
        }
        return countL==countR&&countD==countU;
    }
    public static void main(String[] args) {

    }
}
