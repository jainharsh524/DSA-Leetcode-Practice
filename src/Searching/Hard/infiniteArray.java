package Searching.Hard;

public class infiniteArray {
    static int searchingInInfiniteSortedArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[start]<target&&arr[end]>target){
            int newStart = end+1;
            //double the initial searching range size.
            //Exponential increment in the size of search for optimized performance.
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return binarySearching(arr, target, start, end);
    }
    static int binarySearching(int[] arr, int target, int high, int low){
        while(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
