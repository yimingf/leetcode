class Solution(object):
    def isInterleave(self, s1, s2, s3):
        """
        :type s1: str
        :type s2: str
        :type s3: str
        :rtype: bool
        """
        if (len(s1)+len(s2) != len(s3)):
            return False
        
        if (len(s3) == 0):
            if (len(s1) == 0) and (len(s2) == 0):
                return True
            else:
                return False
            
        if (len(s1)) == 0:
            if s2 == s3:
                return True
            else:
                return False
            
        if (len(s2)) == 0:
            if s1 == s3:
                return True
            else:
                return False
        
        dp = []
        for i in range(len(s1)+1):
            dp.append([])
            for j in range(len(s2)+1):
                dp[i].append(False)
                
        dp[0][0] = True
        
        for i in range(len(s1)):
            dp[i+1][0] = (dp[i][0]) and (s3[i]==s1[i])
        for i in range(len(s2)):
            dp[0][i+1] = (dp[0][i]) and (s2[i]==s3[i])
        
        for i in range(len(s1)):
            for j in range(len(s2)):
                dp[i+1][j+1] = (dp[i][j+1] and s3[i+j+1] == s1[i]) or (dp[i+1][j] and s3[i+j+1]==s2[j])
                
        return dp[len(s1)][len(s2)]