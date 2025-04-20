package Arrays.Easy;
import java.util.*;

//Q.1512 https://leetcode.com/problems/number-of-good-pairs/description/
public class numberOfGoodPairs {

//    public int numIdenticalPairs(int[] nums) {
//        int count=0;
//        for(int i =0;i<nums.length;i++){
//            for(int j =i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]) count++;
//            }
//        }
//        return count;
//    }

    //# Approach
    //An efficient solution is to use ***Hashing***.
    //1. Access the array element see whether the element is already added to hashmap.
    //2. If added already then just increase the count of that element by 1. Else add the element and set count to 1.
    //3. If any element has  frequency of n then no. of good pairs will be ```n*(n-1)//2```(PS.- Hint देखना पडा मुझे. वर्ना ये formula तो घंटा क्रैक ना होता 😂)
    //4. Then use for loop to access the frequencies and then increase the count according to the formula.
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < nums.length; i++)
        {
            if (mp.containsKey(nums[i]))
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else
            {
                mp.put(nums[i], 1);
            }
        }
        int identicalPairs = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            int n = entry.getValue();
            identicalPairs+= n*(n-1)/2;
        }
        return identicalPairs;
    }
    //# Complexity
    //- Time complexity:O(N)
    //- Space complexity:O(N)
    public static void main(String[] args) {

    }
}
