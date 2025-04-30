package Searching.Easy;
import java.util.HashSet;

//Q.1346 https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class checkIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
