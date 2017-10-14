class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        len_ = len(s)
        if len_<2:
            return 0
        
        result = 0
        dp = []
        for i in range(len_):
            dp.append(0)
            
        for i in range(len_-1):
            char_ = s[i+1]
            if char_ == '(':
                continue
            else: # do something
                foo = 0
                pivot = i-dp[i]
                # print('{} {}'.format(i, pivot))
                
                if (pivot>=0) and (s[pivot] == '('):
                    foo = dp[i]+2
                
                pivot_ = i+1-foo
                
                if (pivot_>=0) and (s[pivot_] == ')'):
                    foo = foo+dp[pivot_]
                
                dp[i+1] = foo
                result = max(result, foo)
                
        return result