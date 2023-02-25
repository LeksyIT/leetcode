package com.leksy.leetcode.easy.best_time_to_buy_and_sell_stock_121;

public class Solution {

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {
    int result = 0;
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      int element = prices[i];
      min = Math.min(min, element);
      result = Math.max(result, element - min);
    }
    return result;
  }
}
