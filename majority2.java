import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer> arrl = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(int key: mpp.keySet())
        {
            if(mpp.get(key) > n/3)
            {
                arrl.add(key);
            }
        }

        return arrl;
    }
}