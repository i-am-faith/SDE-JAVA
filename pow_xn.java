class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if(num < 0)
        {
            num = -1 * num;
        }
        while(num > 0)
        {
            if(num % 2 == 0)
            {
                x = x * x;
                num/=2;
            }
            else if(num % 2 == 1)
            {
                ans *= x;
                num--;
            }
        }
        if(n < 0)
        {
            return 1.0/ ans;
        }
        return ans;
    }
}