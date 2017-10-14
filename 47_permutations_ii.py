class Solution(object):
    def permuteUnique(self, nums):
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
        nums = sorted(nums)
        
        def helper(ans_, nums, results):
            if len(nums)==0:
                results.append(ans_)
                return
            
            prev = nums[0]
            for i in range(len(nums)):
                value = nums[i]
                if i>0 and value==prev:
                    continue
                
                helper(ans_+[value], nums[:i]+nums[i+1:], results)
                prev = value
        
        prev = nums[0]
        for i in range(len_):
            value = nums[i]
            if i>0 and value==prev:
                continue
            
            helper([value], nums[:i]+nums[i+1:], results)
            prev = value
        
        return results