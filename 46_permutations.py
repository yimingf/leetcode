class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums)==0:
            return [[]]
        
        if len(nums)==1:
            return [nums]
        
        len_ = len(nums)
        results = []
        
        def helper(ans_, nums_, results):
            if len(nums_)==0:
                results.append(ans_)
                return
            
            for i in range(len(nums_)):
                helper(ans_+[nums_[i]], nums_[:i]+nums_[i+1:], results)
        
        for i in range(len_):
            helper([nums[i]], nums[:i]+nums[i+1:], results)
            
        return results