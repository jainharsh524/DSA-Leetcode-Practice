package Searching.Easy;

//Q.744 https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class smallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) return letters[0];
        else {
            int low = 0;
            int high = letters.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (letters[mid] == target) return letters[mid];
                else if (letters[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            return letters[low];
        }
    }
    //Complexity
    //Time complexity:O(logN)
    public static void main(String[] args) {

    }
}
