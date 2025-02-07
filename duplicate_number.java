import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int dupli = -1;
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i]) > 1)
            {
                dupli = nums[i];
            }
        }
        return dupli;
    }
}