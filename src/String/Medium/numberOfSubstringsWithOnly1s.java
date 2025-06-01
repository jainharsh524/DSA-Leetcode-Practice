package String.Medium;

//Q.1513 https://leetcode.com/problems/number-of-substrings-with-only-1s/description/
public class numberOfSubstringsWithOnly1s {
    public static int numSub(String s) {
        long countOne = 0;
        long subStrings = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                countOne++;
            }
            else {
                long val = countOne*(countOne+1)/2;
                subStrings = subStrings+val;
                countOne=0;
            }
        }
        if(countOne!=0) {
            long val = countOne*(countOne+1)/2;
            subStrings = subStrings+val;
        }
        return (int) (subStrings%(Math.pow(10,9)+7));
    }
    //Another method for counting the substring is used in question: https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
    public static void main(String[] args) {

    }
}
