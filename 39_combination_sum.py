class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        
        if target==0 or len(candidates)==0:
            return [[]]
        
        candidates = sorted(candidates)
        len_ = len(candidates)
        
        def helper(combination, start, end, candidates, target, results):
            if target==0:
                results.append(combination)
                return
            
            for i in range(start, end):  
                value = candidates[i]
                if value<=target:
                    helper(combination+[value], i, end, candidates, target-value, results)
        
        results = []
        
        for i in range(len_):
            value = candidates[i]
            if value<=target:
                helper([value], i, len_, candidates, target-value, results)
                
        return results