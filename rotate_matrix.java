class Solution {
    private void reverse(int[] row)
    {
        int low = 0;
        int high = row.length-1;
        while(low < high)
        {
            int temp = row[low];
            row[low] = row[high];
            row[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Generate Transpose Matrix
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse Every Row
        for(int i=0;i<n;i++)
        {
            reverse(matrix[i]);
        }
    }
}