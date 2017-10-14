class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        if (m==0) or (n==0):
            return 0
        
        if (m==1) or (n==1):
            return 1
    
        dp = []
        for i in range(m):
            dp.append([])
            for j in range(n):
                dp[i].append(1)
            
        for i in range(m-1):
            for j in range(n-1):
                dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j]
        
        return dp[m-1][n-1]