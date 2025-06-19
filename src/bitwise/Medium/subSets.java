package bitwise.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q.78 https://leetcode.com/problems/subsets/
//unsolved
public class subSets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            lst.add(Arrays.stream(nums).boxed().toList());
            subsets(Arrays.copyOfRange(nums, 0, i+1));
            subsets(Arrays.copyOfRange(nums, i+1, nums.length));
        }
        return lst;
    }
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
}
