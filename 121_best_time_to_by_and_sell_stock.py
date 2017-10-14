class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices)<2:
            return 0
        
        dp = 0
        min_ = prices[0]
        
        for i in range(len(prices)-1):
            price_ = prices[i+1]
            if price_<min_:
                min_ = price_
            
            dp = max(dp, price_-min_)
        
        return dp