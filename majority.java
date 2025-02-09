import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maxfreq = -1;
        int result = -1;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            int freq = mpp.get(nums[i]);
            maxfreq = Math.max(maxfreq,freq);
            if(freq == maxfreq)
            {
                result = nums[i];
            }
        }
        return result;
    }
}