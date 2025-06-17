package bitwise.Easy;

//Q.476 https://leetcode.com/problems/number-complement/
public class numberComplement {
    public static int findComplement(int num) {
        int dig = (int) (Math.log(num)/Math.log(2))+1;
        int b = (int) (Math.pow(2, dig)-1);
        return num^b;
    }
    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
