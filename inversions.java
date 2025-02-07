import java.util.*;

public class Solution {
    public static long getInversions(long arr[], int n) {
        long count = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((arr[i] > arr[j]) && (i < j))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
