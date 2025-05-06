package Searching.Medium;

//Q.1011 https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//Sol. https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/solutions/6720604/easy-java-solution-using-binary-search/
public class capacityToShipPackagesInDDays {
    //Algorithm Explanation (in Points):
    //Define Binary Search Range:
    //
    //low = max(weights) (can't be less than the heaviest item)
    //high = sum(weights) * 2 / days (upper bound approximation)
    //Binary Search on Capacity:
    //
    //At each step, choose a mid-capacity
    //Use a helper function to calculate how many days are needed with this capacity
    //If time > days, increase capacity (low = mid + 1)
    //
    //If time ≤ days, try a smaller capacity (high = mid - 1)
    //
    //Final result is low
    //
    //⚙️ timeCalculation() Function:
    //This determines how many days are needed to ship all weights with a given capacity.
    //
    //Steps:
    //
    //Accumulate weights until the total exceeds cap
    //If exact, count a day
    //If over, rollback i (to re-check the package in the next day)
    //If at the end and partial weight remains, count a final day
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) if(max<arr[i]) max = arr[i];
        return max;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int element : arr) sum+=element;
        return sum;
    }
    public static long timeCalculation(int[] arr, int cap){
        long sum = 0;
        int day = 0;
        int i =0;
        while (i< arr.length){
            sum = sum+arr[i];
            if(sum==cap) {
                day++;sum=0;
            }
            else if(sum>cap) {
                sum = 0;
                i--;day++;
            }
            else if (i == arr.length - 1 && sum!=0 && sum < cap) day++;
            i++;
        }
        return day;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights)*2/days;
        while(low<=high){
             int mid = low+(high-low)/2;
            long time = timeCalculation(weights, mid);
//            System.out.println(time);
            if(time> days) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(timeCalculation(arr, 5));
        System.out.println(shipWithinDays(arr, 5));
    }
}
