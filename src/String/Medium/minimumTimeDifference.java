package String.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

//Q.539 https://leetcode.com/problems/minimum-time-difference/description/
public class minimumTimeDifference {
    //Time:O(N^2)
//    public static int calculateDifference(String t1, String t2){
//        int time = 0;
//        int hour1 = Integer.parseInt(t1.substring(0,2));
//        int min1 = Integer.parseInt(t1.substring(3,5));
//        int hour2 = Integer.parseInt(t2.substring(0,2));
//        int min2 = Integer.parseInt(t2.substring(3,5));
//        int m1 = hour1*60+min1;
//        int m2 = hour2*60+min2;
//        time = Math.abs(m2-m1);
//        if(1440-time>time) {
//            return time;
//        }
//        else return 1440-time;
//    }
//    public static int findMinDifference(List<String> timePoints) {
//        int minDifference = 0;
//        for (int i = 0; i < timePoints.size(); i++) {
//            for (int j = i+1; j < timePoints.size(); j++) {
//                int diff = calculateDifference(timePoints.get(i), timePoints.get(j));
//                minDifference = Math.min(diff, minDifference);
//            }
//        }
//        return minDifference;
//    }

    //Time: O(NlogN)
    public static int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h * 60 + m;
        }
        Arrays.sort(minutes);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.length - 1; i++) {
            ans = Math.min(ans, minutes[i + 1] - minutes[i]);
        }
        return Math.min(
                ans,
                24 * 60 - minutes[minutes.length - 1] + minutes[0]
        );
    }
    public static void main(String[] args) {
        String s = "Harsh";
        List<String> lst = new ArrayList<>();
        lst.add("11:59");
        lst.add("07:48");
        Collections.sort(lst);
        System.out.println(lst);
//        System.out.println(calculateDifference("23:59", "00:00"));
        System.out.println();
    }
}
