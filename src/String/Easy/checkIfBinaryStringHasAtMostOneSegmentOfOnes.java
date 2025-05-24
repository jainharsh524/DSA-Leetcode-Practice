package String.Easy;

//Q.1784 https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class checkIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
    public static void main(String[] args) {

    }
}
