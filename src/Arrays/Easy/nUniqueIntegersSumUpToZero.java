package Arrays.Easy;

//Q.1304 https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class nUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int ptr1 = 0;
        int ptr2 = n-1;
        int start = 1;

        while(ptr1 < ptr2){
            res[ptr1++] = start;
            res[ptr2--] = -start;
            start++;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
