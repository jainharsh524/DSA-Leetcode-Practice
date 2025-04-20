package Arrays.Easy;
import java.util.ArrayList;
import java.util.List;

//Q.1431 https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class kidsWithTheGreatestNumberOfCandies {
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        for (int i =0;i<candies.length;i++){
            if(candies[i]+extraCandies>=findMax(candies)) list.add(true);
            else list.add(false);
        }
        return list;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(N)
}
