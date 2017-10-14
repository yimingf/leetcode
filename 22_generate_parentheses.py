class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        
        if n==0:
            return [""]
        
        def helper(str_, left, right, result):
            if right == 0:
                result.append(str_)
                return
            else:
                if left>0:
                    helper(str_+'(', left-1, right, result)
                
                if left<right:
                    helper(str_+')', left, right-1, result)
                    
        result = []
        helper('(', n-1, n, result)
        
        return result