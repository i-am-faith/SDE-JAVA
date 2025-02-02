class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = -1;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum > 0)
            {
                maxi = Math.max(maxi,sum);
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}