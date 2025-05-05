package Searching.Medium;

//Q.1011 https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class capacityToShipPackagesInDDays {
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) if(max<arr[i]) max = arr[i];
        return max;
    }
    public static long timeCalculation(int[] arr, int speed){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int time = arr[i]/speed;
            if(arr[i]%speed==0) sum+=time;
            else sum = sum+time+1;
        }
        return sum;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = max(weights);
        if(days == weights.length) return max(weights);
        else{
            while(low<=high){
                int mid = low+(high-low)/2;
                long time = timeCalculation(weights, mid);
                System.out.println(time);
                if(time> days) low = mid+1;
                else high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {

    }
}
