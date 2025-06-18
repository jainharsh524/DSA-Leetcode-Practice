package bitwise.Easy;

//Q. https://leetcode.com/problems/xor-operation-in-an-array/
public class XOROperationInAnArray {
    public static int xorOperation(int n, int start) {
        n--;
        int val = start+(n)*2;
        if(n==0){
            return start;
        }
        else return val^xorOperation(n, start);
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
}
