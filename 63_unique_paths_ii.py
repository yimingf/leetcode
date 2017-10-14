class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        if len(obstacleGrid)==0 or len(obstacleGrid[0])==0:
            return 0
        
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        
        dp = []
        for i in range(m):
            dp.append([])
            for j in range(n):
                dp[i].append(0)
        
        flag = False
        for i in range(m):
            if (flag==False) and obstacleGrid[i][0]==1:
                flag = True
                
            if flag==True:
                dp[i][0] = 0
            else:
                dp[i][0] = 1
                
        flag = False
        for i in range(n):
            if (flag==False) and obstacleGrid[0][i]==1:
                flag = True
            
            if flag==True:
                dp[0][i] = 0
            else:
                dp[0][i] = 1
        
        for i in range(m-1):
            for j in range(n-1):
                if obstacleGrid[i+1][j+1]==1:
                    dp[i+1][j+1] = 0
                else:
                    dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j]
                    
        return dp[m-1][n-1]