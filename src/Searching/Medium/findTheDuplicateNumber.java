package Searching.Medium;

//Q.287 https://leetcode.com/problems/find-the-duplicate-number/
//Sol. https://leetcode.com/problems/find-the-duplicate-number/solutions/6717261/easy-java-solution-by-jainharsh524-lffj/
public class findTheDuplicateNumber {
    //We use Floyd’s Tortoise and Hare (Cycle Detection) algorithm.
    //
    //🔁 Analogy:
    //Think of elements as next pointers in a linked list. A duplicate makes two nodes point to the same next node, which creates a cycle.
    //
    //Why this works:
    //Think of the array as a linked list where:
    //
    //The value at each index is a pointer to the next node (i.e., i → nums[i]).
    //Due to the pigeonhole principle (n+1 numbers in range [1, n]), a cycle must exist.
    //The cycle is formed due to the duplicate value pointing to the same node more than once.
    //Approach (Using Cycle Detection):
    //Initialize two pointers:
    //
    //slow moves one step at a time: slow = nums[slow]
    //fast moves two steps at a time: fast = nums[nums[fast]]
    //Detect the cycle:
    //
    //Continue moving both until they meet. This confirms a cycle exists.
    //Find the entry point of the cycle (duplicate number):
    //
    //Reset one pointer to the start (index 0), and move both one step at a time:
    //slow = nums[slow]
    //fast = nums[fast]
    //The meeting point is the duplicate number.
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {

    }
}
