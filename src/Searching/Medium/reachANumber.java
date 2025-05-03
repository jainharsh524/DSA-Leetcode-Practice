package Searching.Medium;

//Q.745 https://leetcode.com/problems/reach-a-number/description/
public class reachANumber {
    //# Algorithm without Binary Search:
    //
    //1. **Convert `target` to its absolute value**
    //   - The problem is symmetric around 0 (i.e., same moves needed for `+target` and `-target`).
    //   - So we only need to consider the **positive version** of the target.
    //
    //2. **Initialize:**
    //   - `steps = 1`: the step number (will increase each move).
    //   - `currentValue = 0`: our current position.
    //   - `moves = 0`: count of total moves taken.
    //
    //3. **While loop runs until:**
    //   - We've either reached or gone beyond the `target`, and
    //   - The difference between `currentValue` and `target` is even.
    //
    //4. **Why even difference matters:**
    //   - Because if the difference is even, you can reverse one of your previous steps to adjust.
    //   - E.g., if you're at `currentValue = 7` and want to reach `target = 3`, the difference is 4 (even), so you can flip a `2` step to `-2` to go from 7 to 3.
    //
    //5. **Inside the loop:**
    //   - If `currentValue >= target` and the difference is **even**, we can stop.
    //   - Otherwise, add the next step (`steps`) to `currentValue`, and increment `steps` and `moves`.
    //
    //6. **Finally, return `moves`**, which is the **minimum number of steps** to reach the target.
    public static int reachNumber(int target) {
        int steps = 1;
        int currentValue = 0;
        int moves = 0;
        target = Math.abs(target);
        while(true){
            if(currentValue>=target) {
                if ((currentValue - target) % 2 != 0) {
                    currentValue = currentValue + steps;
                    steps++;
                    moves++;
                } else break;
            }
            else{
                currentValue = currentValue + steps;
                steps++;
                moves++;
            }
        }
        return moves;
    }
    //# Algorithm with Binary Search:
    //1. **Take absolute of target:**
    //   - Since movement can be in either direction, only the absolute distance matters.
    //
    //2. **Binary Search to find minimal step count `n` such that:**
    //   - The sum of first `n` numbers `S = n(n+1)/2` is **≥ target**
    //   - This reduces the search space from linear to logarithmic time.
    //
    //3. **Store that sum in `currentValue` and the corresponding steps in `steps`**
    //
    //4. **Check if the difference `(currentValue - target)` is even:**
    //   - If yes: we can flip one of the steps to reach `target` exactly → ✅ done.
    //   - If no: we continue adding more steps until the difference becomes even.
    //
    //5. **Return `steps`** when the difference is even.
//    public static int reachNumber(int target) {
//        target = Math.abs(target);
//        int start = 1, end = target, currentValue = 0, steps = 0;
//        long sum = 0;
//        while(start <= end) {
//            int mid = start + (end - start)/2;
//            sum = (long)mid*(mid+1)/2;
//            if(sum >= target) {
//                currentValue = (int)sum;
//                steps = mid;
//                end = mid-1;
//            }
//            else {
//                start = mid+1;
//            }
//        }
//        while((currentValue -target)%2!=0) {
//            steps++;
//            currentValue +=steps;
//        }
//        return steps;
//    }
    public static void main(String[] args) {
        System.out.println(reachNumber(9));
//        System.out.println(Math.abs(-1));
        //0>1>3>6>10
        //0>-1>1>4>4
        //0>1>3>6>10>5
        //0>1>3>6
    }
}
