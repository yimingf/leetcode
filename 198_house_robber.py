class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        len_ = len(nums)
        
        if len_ == 0:
            return 0
        if len_ == 1:
            return nums[0]
        if len_ == 2:
            return max(nums[0], nums[1])
        
        dp = []
        dp.append(nums[0])
        dp.append(max(nums[0], nums[1]))
        
        for i in range(len_-2):
            dp.append(max(dp[i]+nums[i+2], dp[i+1]))
        
        return dp[len_-1]