package Sorting.Easy;

//Q.169 https://leetcode.com/problems/majority-element/
//Sol. https://leetcode.com/problems/majority-element/solutions/6728512/easy-java-solution-beats-99-by-jainharsh-mkzu/
public class majorityElement {
    //Algorithm – Step-by-Step
    //Initialize two variables:
    //
    //res → to store the current candidate.
    //count → to keep track of the vote count.
    //Iterate through the array:
    //
    //If count == 0, set res = current element.
    //If current element == res, increment count.
    //Else, decrement count.
    //After the loop ends, res will contain the majority element (if one exists).
    //
    //Why it works
    //It cancels out each occurrence of an element not equal to the majority element.
    //Since the majority element appears more than ⌊n/2⌋ times, it will remain after all cancellations.

    public int majorityElement(int[] nums) {
        int votes = 0;
        int majorElement = -1;
        for (int i = 0; i < nums.length; i++) {
            if(votes==0) majorElement = nums[i];
            if(nums[i]==majorElement){
                votes++;
            }
            else votes--;
        }
        return majorElement;
    }
    //You should use the **Boyer-Moore Majority Vote Algorithm** when:
    //
    //---
    //
    //### ✅ **When to Use**
    //
    //1. **You are guaranteed that a majority element exists**
    //   → It works best **only if an element appears more than ⌊n/2⌋ times**.
    //
    //2. **You want a highly efficient solution**
    //   - **Time Complexity:** O(n)
    //   - **Space Complexity:** O(1)
    //   → Ideal for large datasets.
    //
    //3. **You need constant space**
    //   → It doesn't use hash maps or frequency arrays.
    //
    //---
    //
    //### 🚫 **When *Not* to Use**
    //
    //1. ❌ When the **majority element might not exist**
    //   → It doesn't verify if the result truly occurs more than ⌊n/2⌋ times unless you do a second pass.
    //
    //2. ❌ When you need to find **all elements appearing more than ⌊n/3⌋ times**
    //   → For that, a modified Boyer-Moore version is needed.
    //
    //---
    //
    //Would you like to see a code snippet that also **verifies** the majority after applying this algorithm?
    public static void main(String[] args) {

    }
}
