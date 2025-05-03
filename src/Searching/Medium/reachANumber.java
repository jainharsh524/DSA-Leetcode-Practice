package Searching.Medium;

//Q.745 https://leetcode.com/problems/reach-a-number/description/
public class reachANumber {
    public static int reachNumber(int target) {
        int steps = 1;
        int currentValue = 0;
        int moves = 0;
        target = Math.abs(target);
        while(true){
            if(currentValue>=target) {
                if ((currentValue - target) % 2 != 0) {
                    currentValue = currentValue + steps;
                    steps++;
                    moves++;
                } else break;
            }
            else{
                currentValue = currentValue + steps;
                steps++;
                moves++;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        System.out.println(reachNumber(9));
//        System.out.println(Math.abs(-1));
        //0>1>3>6>10
        //0>-1>1>4>4
        //0>1>3>6>10>5
        //0>1>3>6
    }
}
