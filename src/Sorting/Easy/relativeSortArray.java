package Sorting.Easy;

import java.util.*;

//Q.1122 https://leetcode.com/problems/relative-sort-array/
public class relativeSortArray {
    public static HashMap<Integer, Integer> count(int[] arr){
        HashMap <Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])) hm.put(arr[i], 1);
            else hm.replace(arr[i], hm.get(arr[i])+1);
        }
        return hm;
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap <Integer, Integer> hm = count(arr1);
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while(hm.get(arr2[i])!=0){
                arr1[index] = arr2[i];
                hm.replace(arr2[i], hm.get(arr2[i])-1);
                index++;
            }
            hm.remove(arr2[i]);
        }
        while(!hm.isEmpty()){
            int minKey = Collections.min(hm.keySet());
            while(hm.get(minKey)!=0){
                arr1[index] = minKey;
                hm.replace(minKey, hm.get(minKey)-1);
                index++;
            }
            hm.remove(minKey);
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
}
