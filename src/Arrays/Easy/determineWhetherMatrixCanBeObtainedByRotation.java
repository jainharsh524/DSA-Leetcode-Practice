package Arrays.Easy;

public class determineWhetherMatrixCanBeObtainedByRotation {
    //# Approach
    //I have 2 approaches for this question:
    //1. Transpose and swap the cols.
    //2. - Map the indexes and their behaviour upon rotation and deduce a formula.
    //   - apply that formula to check whether the position of all elements is correct or not.
    //
    //# Complexity
    //- Time complexity:O(N*N)
    public boolean findRotation(int[][] a, int[][] b) {
        int len =a.length;
        int count_90 =0, count_180 =0, count_270 =0, count_0 =0;
        for(int i = 0; i< len; i++)
        {
            for(int j = 0; j< len; j++)
            {
                if(b[i][j]==a[len -j-1][i]) // this is the formula obtained by analysis of matrix on rotation.
                    count_90++;
                if(b[i][j]==a[len -i-1][len -j-1])
                    count_180++;
                if(b[i][j]==a[j][len -i-1])
                    count_270++;
                if(b[i][j]==a[i][j])
                    count_0++;
            }
        }
        //Here we are checking every element whether it is at its correct position after rotation or not.
        //That's why we are comparing it with the n*n.
        //Time complexity: O(N*N);
        if(count_90 == len * len || count_270 == len * len || count_180 == len * len || count_0 == len * len)
            return true;
        else return false;
    }
}
