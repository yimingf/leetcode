class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        if n<=2:
            return n
        
        dp = []
        dp.append(1)
        dp.append(2)
        
        for i in range(n-2):
            dp.append(dp[i]+dp[i+1])
            
        return dp[n-1]