package String.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q.1898 https://leetcode.com/problems/maximum-number-of-removable-characters/
public class maximumNumberOfRemovableCharacters {
    public static boolean isSubsequence(String s, String p){
        int i = 0;
        int j= 0;
        while (i<s.length()&&j<p.length()){
            if(s.charAt(i)==p.charAt(j)) {
                j++;
            }
            i++;
        }
        return j==p.length();
    }
    //1. **Convert the input string** `str` into a `StringBuilder` for easy character deletion.
    //2. **Create an empty list** `indexList` to store the specific indices to be deleted.
    //3. **Loop through the `indexes` array** from `start` to `end` and add those values to `indexList`.
    //4. **Sort `indexList` in descending order** (reverse order) to avoid index shifting issues during deletion.
    //5. **Loop through each index in `indexList`**:
    //
    //   * Check if the index is within bounds of the current string (`0 <= index < sb.length()`).
    //   * If valid, **delete the character** at that index from the `StringBuilder`.
    //6. **Return the modified string** by converting the `StringBuilder` back to a string.
    // if you want to delete the multiple chars at different indexes start deleting from the highest indexes
    // So that shift of the indexes does not change the positions of next deleting elements.
    public static String deleteMultipleIndexes(String str, int[] indexes, int start, int end) {
        StringBuilder sb = new StringBuilder(str);
        List<Integer> indexList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            indexList.add(indexes[i]);
        }
        indexList.sort(Collections.reverseOrder());
        for (int index : indexList) {
            sb.deleteCharAt(index);
        }

        return sb.toString();
    }

    public static int maximumRemovals(String s, String p, int[] removable) {
//        for (int i = 0; i < removable.length; i++) {
//            sb.deleteCharAt(removable[i]);
//            if(!isSubsequence(sb.toString(), p)) return i;
//        }
        int high = removable.length-1;
        int low = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            String del = deleteMultipleIndexes(s, removable, 0, mid);
            System.out.println(del);
            if(!isSubsequence(del, p)){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println(maximumRemovals("qobftgcueho", "obue", new int[]{5,3,0,6,4,9,10,7,2,8}));
    }
}
