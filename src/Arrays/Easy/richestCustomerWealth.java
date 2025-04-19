package Arrays.Easy;
//Q.1672 https://leetcode.com/problems/richest-customer-wealth/description/
public class richestCustomerWealth {
    static int sum(int[] arr){
        int sum =0;
        for(int i =0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i =0;i<accounts.length;i++){
            int wealth = sum(accounts[i]);
            if(wealth>maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}

//Time complexity: O(N*M)
