package Sorting.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q.56 https://leetcode.com/problems/merge-intervals/
//Sol. https://leetcode.com/problems/merge-intervals/solutions/6750734/easy-java-solution-using-sorting-and-lambda-function-for-sorting-2d-array-explained-also/
public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,4},
                {5,6}};
        int[][] res = merge(intervals);
        System.out.println(res.length);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j]+", ");
            }
            System.out.println();
        }
    }
}
