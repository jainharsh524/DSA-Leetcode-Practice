package Searching.Medium;

//Q.875 https://leetcode.com/problems/koko-eating-bananas/description/
//Sol. https://leetcode.com/problems/koko-eating-bananas/solutions/6716436/easy-java-solution-using-binary-search-with-flowchart/
public class kokoEatingBananas {
    //# **Algorithm to Find Minimum Eating Speed**
    //
    //1. **Find Search Boundaries**:
    //   - `low = 1` (minimum possible speed)
    //   - `high = max(piles)` (maximum pile value; worst-case speed)
    //
    //2. **Binary Search**:
    //   - While `low <= high`:
    //     - Compute `mid = low + (high - low) / 2` → current candidate speed
    //     - Calculate total time required at `mid` speed using `timeCalculation()`
    //       - For each pile:
    //         - If divisible: `time += pile / speed`
    //         - Else: `time += (pile / speed) + 1`
    //     - If total time > `h`: speed is too slow → increase speed → `low = mid + 1`
    //     - Else: speed is fast enough → try slower speed → `high = mid - 1`
    //
    //3. **Return `low`**:
    //   - At the end, `low` is the minimum eating speed for which total time ≤ `h`
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

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        if(h==piles.length) return max(piles);
        else{
            while(low<=high){
                int mid = low+(high-low)/2;
                long time = timeCalculation(piles, mid);
                System.out.println(time);
                if(time>h) low = mid+1;
                else high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(piles, 1000000000));
    }
}
