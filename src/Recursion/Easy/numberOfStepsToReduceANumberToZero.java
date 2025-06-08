package Recursion.Easy;

//Q.1342 https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class numberOfStepsToReduceANumberToZero {
    public static int helper(int num, int step){
        if(num==0) return step;
        else {
            if ((num & 1) == 0) {
                step++;
                return helper(num / 2, step);
            } else {
                step++;
                return helper(num - 1, step);
            }
        }
    }

    public static int numberOfSteps(int num) {
        int step = 0;
        return helper(num, step);
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}
