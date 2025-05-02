package Searching.Medium;

//Q.745 https://leetcode.com/problems/reach-a-number/description/
public class reachANumber {
    public static int reachNumber(int target) {
        int steps = 1;
        int currentValue = 0;
        int moves = 0;
        while(currentValue<Math.abs(target)){
            if(currentValue+steps > Math.abs(target)) currentValue = currentValue- steps;
            else currentValue = currentValue+ steps;
            steps++; moves++;
        }
        return moves;
    }
    public static void main(String[] args) {
        System.out.println(reachNumber(5));
        //0>1>3
        System.out.println(Math.abs(-1));
    }
}
