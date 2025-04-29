package Searching.Easy;

import java.util.*;

//Q.350 https://leetcode.com/problems/intersection-of-two-arrays-ii/
//Sol. https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/6699449/beats-100-using-java-hashmap-and-beats-9-c66k/
public class intersectionOfTwoArrays2 {
    //# Algorithm-1
    //
    //1. **Sort both arrays**:
    //   - Sort `nums1` and `nums2` to simplify comparison using two pointers.
    //
    //2. **Initialize pointers**:
    //   - Set `i = 0` and `j = 0` to start at the beginning of each array.
    //   - Also, create a list `ls` to store the intersection result.
    //
    //3. **Use two-pointer technique**:
    //   - While `i < length of nums1` and `j < length of nums2`:
    //     - If `nums1[i] < nums2[j]`: increment `i`
    //     - Else if `nums1[i] > nums2[j]`: increment `j`
    //     - Else:
    //       - Elements are equal, so it's part of the intersection.
    //       - Add `nums1[i]` to `ls`, and increment both `i` and `j`
    //
    //4. **Convert the list to an array**:
    //   - Create a new array `arr` of the same size as `ls`
    //   - Copy elements from the list into the array
    //
    //5. **Return the result array**
//    public int[] intersect(int[] nums1, int[] nums2) {
//        int l1 = nums1.length;
//        int l2 = nums2.length;
//        int i = 0, j = 0, k = 0;
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> ls = new ArrayList<>();
//        while( i < l1 && j < l2)
//        {
//            if(nums1[i] < nums2[j])
//            {
//                i++;
//            }
//            else if(nums1[i] > nums2[j])
//            {
//                j++;
//            }
//            else
//            {
//                ls.add(nums1[i]);
//                i++;j++;
//            }
//        }
//        int[] arr = new int[ls.size()];
//        for (int l = 0; l < arr.length; l++) {
//            arr[l] = ls.get(l);
//        }
//        return arr;
//    }

    //# Algorithm-2
    //
    //1. **Create a HashMap**:
    //   - Store the **frequency count** of each number in `nums1`.
    //
    //2. **Traverse `nums2`**:
    //   - For each number in `nums2`, check if it's present in the map and has a count > 0.
    //   - If yes:
    //     - Add it to the result list.
    //     - Decrease its count in the map.
    //
    //3. **Convert the result list to an array** and return.
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] resArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i] = result.get(i);
        }

        return resArr;
    }
    public static void main(String[] args) {

    }
}
