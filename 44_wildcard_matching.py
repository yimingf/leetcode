class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        s_ = len(s)
        p_ = len(p)
        
        if (s_ == 0) and (p_ == 0):
            return True
        
        dp = []
        for i in range(p_+1):
            dp.append([])
            for j in range(s_+1):
                dp[i].append(False)
                
        dp[0][0] = True
        
        for i in range(p_):        
            str_ = p[i]
            
            if str_ == '*':
                flag = False
                
                for j in range(0, s_+1):
                    if (flag != True) and (dp[i][j] == True):
                        flag = True
                        
                    if flag == True:
                        dp[i+1][j] = True
                    
                continue
            
            if str_ == '?':                
                for j in range(0, s_):
                    if dp[i][j] == True:
                        dp[i+1][j+1] = True
                continue
            
            for j in range(0, s_):
                if (dp[i][j] == True) and (str_ == s[j]):
                    dp[i+1][j+1] = True
            
        return dp[p_][s_]