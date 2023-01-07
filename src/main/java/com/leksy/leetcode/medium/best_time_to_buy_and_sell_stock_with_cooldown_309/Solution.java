package com.leksy.leetcode.medium.best_time_to_buy_and_sell_stock_with_cooldown_309;

public class Solution {

  public static void main(String[] args) {
    maxProfit(new int[]{2, 4, 6, 2, 5, 6});
  }

  public static int maxProfit(int[] prices) {
    int sell=0, max=0;
    for(int i=1; i<prices.length; i++){
      int copy=sell;
      sell=Math.max(sell+prices[i]-prices[i-1], max);
      max=Math.max(copy, max);
    }
    return Math.max(max, sell);
  }

//  def maxProfit(self, prices: List[int]) -> int:
//  n = len(prices)
//  b = [0] * n
//  s = [0] * n
//  b[0] = -prices[0]
//      for i in range(1, n):
//  b[i] = max(b[i - 1], s[i - 2] - prices[i])
//  s[i] = max(s[i - 1], b[i - 1] + prices[i])
//        return s[-1]
}
