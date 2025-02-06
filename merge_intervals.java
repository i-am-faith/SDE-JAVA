import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        // Sorting Using Comparator as one element contains two pair
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        List<int[]> arrl = new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            // 1) Insert First Interval If List is empty 
            // 2) Compare curr element first pair with list's last element's last pair
            if(arrl.isEmpty() || arrl.get(arrl.size()-1)[1] < intervals[i][0])
            {
                arrl.add(intervals[i]);
            }
            else
            {
                arrl.get(arrl.size()-1)[1] = Math.max(arrl.get(arrl.size()-1)[1],intervals[i][1]);
            }
        }

        int[][] result = new int[arrl.size()][2];
        for(int i=0;i<arrl.size();i++)
        {
            result[i] = arrl.get(i);
        }

        return result;
    }
}