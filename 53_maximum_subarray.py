class Solution(object):
  def maxSubArray(self, nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    local = nums[0]
    global_ = nums[0]
    
    for i in range(len(nums)-1):
        local = max(local+nums[i+1], nums[i+1])
        global_ = max(local, global_)
        
    return global_